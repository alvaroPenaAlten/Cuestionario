package com.example.core.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.core.domain.Rol;
import com.example.core.domain.User;
import com.example.core.dto.RolDto;
import com.example.core.mapper.RolMapper;
import com.example.core.repository.RolRepository;
import com.example.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RolServiceImp implements RolService{

    @Autowired
    private RolRepository rolRepository;
    private UserRepository userRepository;
    private RolMapper rolMapper;

    public RolServiceImp(RolRepository rolRepository, RolMapper rolMapper,UserRepository userRepository) {
        this.rolRepository = rolRepository;
        this.rolMapper = rolMapper;
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<RolDto> getAllRols() {
        List<Rol> rols = rolRepository.findAll();
        return rols.stream()
                .map(rolMapper::toRolDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Rol> getRolById(Long id) {
        return rolRepository.findById(id);
    }

    @Override
    @Transactional
    public Rol updateRol(Rol rol){

        Rol rolDb = rolRepository.findById(rol.getId()).orElse(null);
        if(rolDb != null){
            rolDb.setName(rol.getName());
            return rolRepository.save(rolDb);
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteRol(Long id) {
        Rol rol = rolRepository.findById(id).orElse(null);
        if (rol != null) {
            Rol rolDfault = rolRepository.findById(4L).orElse(null);
            List<User> users = userRepository.findAll().stream()
                    .filter(user -> user.getRol().getId().equals(id)).toList();
            users.forEach(u -> u.setRol(rolDfault));
            userRepository.saveAll(users);
            rolRepository.delete(rol);
        } else {
            throw new RuntimeException("Rol con ID " + id + " no encontrado.");
        }

    }

}
package com.userDto.service;

import com.userDto.domain.Rol;
import com.userDto.dto.RolDto;
import com.userDto.mapper.RolMapper;
import com.userDto.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class RolServiceImp implements RolService{

    @Autowired
    private RolRepository rolRepository;
    private RolMapper rolMapper;

    public RolServiceImp(RolRepository rolRepository, RolMapper rolMapper) {
        this.rolRepository = rolRepository;
        this.rolMapper = rolMapper;
    }

    @Override
    public List<RolDto> getAllRols() {
        List<Rol> rols = rolRepository.findAll();
        System.out.println("Rols found: " + rols);
        return rols.stream()
                .map(rolMapper::toRolDto)
                .collect(Collectors.toList());
    }
}

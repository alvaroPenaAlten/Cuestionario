package com.example.core.service;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.core.domain.Permisos;
import com.example.core.dto.PermisosDto;
import com.example.core.mapper.PermisosMapper;
import com.example.core.repository.PermisosRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PermisosServiceImp implements PermisosService{

    private PermisosRepository permisosRepository;
    private PermisosMapper permisosMapper;

    public PermisosServiceImp(PermisosRepository permisosRepository, PermisosMapper permisosMapper) {
        this.permisosRepository = permisosRepository;
        this.permisosMapper = permisosMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<PermisosDto> getAllRols() {
        List<Permisos> permisos = permisosRepository.findAll();
        return permisos.stream()
                .map(permisosMapper::toPermisosDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Permisos> getPermisoById(Long id) {
        return permisosRepository.findById(id);
    }

    @Override
    @Transactional
    public Permisos updatePermiso(Permisos permiso){
        Permisos permisoDb = permisosRepository.findById(permiso.getId()).orElse(null);
        if(permisoDb != null){
            permisoDb.setTitulo(permiso.getTitulo());
            return permisosRepository.save(permisoDb);
        }
        return null;
    }

    @Override
    @Transactional
    public void deletePermiso(Long id){
        Permisos permiso = permisosRepository.findById(id).orElse(null);
        permisosRepository.deleteById(id);
    }

}

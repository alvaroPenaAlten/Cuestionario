package com.userDto.service;


import com.userDto.domain.Permisos;
import com.userDto.dto.PermisosDto;
import com.userDto.mapper.PermisosMapper;
import com.userDto.repository.PermisosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PermisosServiceImp implements PermisosService{

    @Autowired
    private PermisosRepository permisosRepository;
    private PermisosMapper permisosMapper;

    public PermisosServiceImp(PermisosRepository permisosRepository, PermisosMapper permisosMapper) {
        this.permisosRepository = permisosRepository;
        this.permisosMapper = permisosMapper;
    }


    @Override
    public List<PermisosDto> getAllRols() {
        List<Permisos> permisos = permisosRepository.findAll();
        return permisos.stream()
                .map(permisosMapper::toPermisosDto)
                .collect(Collectors.toList());
    }
}

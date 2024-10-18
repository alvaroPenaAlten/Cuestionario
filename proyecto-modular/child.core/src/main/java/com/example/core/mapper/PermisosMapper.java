package com.example.core.mapper;


import com.example.core.domain.Permisos;
import com.example.core.dto.PermisosDto;
import org.springframework.stereotype.Component;

@Component
public class PermisosMapper {
    public PermisosDto toPermisosDto(Permisos permisos){
        PermisosDto permisosDto = new PermisosDto();
        permisosDto.setId(permisos.getId());
        permisosDto.setTitle(permisos.getTitulo());
        return permisosDto;
    }
}

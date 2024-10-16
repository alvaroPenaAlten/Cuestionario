package com.userDto.mapper;

import com.userDto.domain.Permisos;
import com.userDto.domain.Rol;
import com.userDto.dto.PermisosDto;
import com.userDto.dto.RolDto;
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

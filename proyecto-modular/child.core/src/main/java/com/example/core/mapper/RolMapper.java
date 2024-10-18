package com.example.core.mapper;


import com.example.core.domain.Rol;
import com.example.core.dto.RolDto;
import org.springframework.stereotype.Component;

@Component
public class RolMapper {

    public RolDto toRolDto(Rol rol){
        RolDto rolDto = new RolDto();
        rolDto.setId(rol.getId());
        rolDto.setName(rol.getName());
        return rolDto;
    }

    public Rol toEntity(RolDto rolDto){
        Rol rol = new Rol();
        rol.setId(rolDto.getId());
        rol.setName(rolDto.getName());
        return rol;
    }

}

package com.userDto.mapper;

import com.userDto.domain.Rol;
import com.userDto.dto.RolDto;
import org.springframework.stereotype.Component;


@Component
public class RolMapper {

    public RolDto toRolDto(Rol rol){
        return new RolDto(rol.getId(),rol.getName());
    }

}

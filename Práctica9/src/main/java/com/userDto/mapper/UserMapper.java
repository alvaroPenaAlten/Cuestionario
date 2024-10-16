package com.userDto.mapper;


import com.userDto.domain.Permisos;
import com.userDto.domain.Rol;
import com.userDto.domain.RolPermiso;
import com.userDto.domain.User;
import com.userDto.dto.PermisosDto;
import com.userDto.dto.RolDto;
import com.userDto.dto.UserDtoName;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public UserDtoName toUserDtoName(User user){

        UserDtoName userDtoName = new UserDtoName();
        userDtoName.setId(user.getId());
        userDtoName.setCompleteName(user.getName().concat(user.getSubname()));
        userDtoName.setUsername(user.getUsername());

        Rol rol = user.getRol();
        userDtoName.setRol(rol);

//        RolDto rolDto = toRolDto(user.getRol());
//        userDtoName.setRol(rolDto);
        return userDtoName;
    }

//    private RolDto toRolDto(Rol rol) {
//        RolDto rolDto = new RolDto();
//        rolDto.setId(rol.getId());
//        rolDto.setName(rol.getName());
//        rolDto.setPermisos(rol.getRolPermisos());
//        return rolDto;
//    }


}
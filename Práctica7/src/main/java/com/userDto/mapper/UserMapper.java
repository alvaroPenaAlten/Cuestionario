package com.userDto.mapper;


import com.userDto.domain.Rol;
import com.userDto.domain.User;
import com.userDto.dto.RolDto;
import com.userDto.dto.UserDtoName;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDtoName toUserDtoName(User user){

        UserDtoName userDtoName = new UserDtoName();
        userDtoName.setId(user.getId());
        userDtoName.setCompleteName(user.getName().concat(user.getSubname()));
        userDtoName.setUsername(user.getUsername());

        RolDto rolDto = toRolDto(user.getRol());
        userDtoName.setRol(rolDto);
        return userDtoName;
    }

    private RolDto toRolDto(Rol rol) {
        RolDto rolDto = new RolDto();
        rolDto.setId(rol.getId());
        rolDto.setName(rol.getName());
        return rolDto;
    }

}
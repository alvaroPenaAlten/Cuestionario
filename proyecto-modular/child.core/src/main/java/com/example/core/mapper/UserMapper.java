package com.example.core.mapper;



import com.example.core.domain.Rol;
import com.example.core.domain.User;
import com.example.core.dto.UserDtoName;
import org.springframework.stereotype.Component;

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
package com.userDto.mapper;


import com.userDto.domain.User;
import com.userDto.dto.UserDtoName;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDtoName toUserDtoName(User user){
        return new UserDtoName(user.getId(),
                user.getName() + " " + user.getSubname(),
                user.getUsername());
    }

}

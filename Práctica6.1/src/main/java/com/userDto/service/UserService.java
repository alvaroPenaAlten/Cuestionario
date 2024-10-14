package com.userDto.service;


import com.userDto.domain.User;
import com.userDto.domain.UserDto;
import com.userDto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDto> getAllUsers(){
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> new UserDto(user.getId(),
                        user.getName(),
                        user.getSubname(),
                        user.getUsername(),
                        user.getPassword(),
                        user.getEnabled()))
                .collect(Collectors.toList());

    }

    public UserDto getUserById(Long id) {
        return userRepository.findById(id)
                .map(user -> new UserDto(user.getId(),
                        user.getName(),
                        user.getSubname(),
                        user.getUsername(),
                        user.getPassword(),
                        user.getEnabled()))
                .orElse(null);
    }

}

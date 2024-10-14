package com.userDto.service;

import com.userDto.domain.User;
import com.userDto.dto.UserDtoName;
import com.userDto.mapper.UserMapper;
import com.userDto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService{

    private UserRepository userRepository;
    private UserMapper userMapper;

    @Autowired
    public UserServiceImp(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDtoName> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(userMapper::toUserDtoName)
                .collect(Collectors.toList());
    }

    @Override
    public UserDtoName getUserById(Long id) {
        return userRepository.findById(id)
                .map(userMapper::toUserDtoName)
                .orElse(null);
    }
}

package com.userDto.service;

import com.userDto.domain.User;
import com.userDto.dto.UserDtoName;
import com.userDto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDtoName> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> new UserDtoName(user.getId(),
                        user.getName() +" "+ user.getSubname(),
                        user.getUsername()))
                .collect(Collectors.toList());
    }

    @Override
    public UserDtoName getUserById(Long id) {
        return userRepository.findById(id)
                .map(user -> new UserDtoName(user.getId(),
                        user.getName() +" "+ user.getSubname(),
                        user.getUsername()))
                .orElse(null);
    }
}

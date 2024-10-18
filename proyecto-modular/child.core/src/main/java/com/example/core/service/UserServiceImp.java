package com.example.core.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.core.domain.User;
import com.example.core.dto.UserDtoName;
import com.example.core.exceptions.UserNotFoundException;
import com.example.core.mapper.UserMapper;
import com.example.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(readOnly = true)
    public List<UserDtoName> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(userMapper::toUserDtoName)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> getUserById(Long id) {
    return userRepository.findById(id);
    }

    @Override
    @Transactional
    public User updateUser(User user){

        User userDb = userRepository.findById(user.getId()).orElseThrow(() -> new UserNotFoundException("Usuario con ID " + user.getId() + " no encontrado"));
            userDb.setName(user.getName());
            userDb.setSubname(user.getSubname());
            userDb.setUsername(user.getUsername());
            userDb.setPassword(user.getPassword());

            return userRepository.save(userDb);
    }

    @Override
    @Transactional
    public void deleteUser(Long id){
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario con ID " + id + " no encontrado"));
        userRepository.deleteById(id);
    }

}

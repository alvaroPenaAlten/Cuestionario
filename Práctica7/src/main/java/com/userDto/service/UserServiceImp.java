package com.userDto.service;

import com.userDto.domain.User;
import com.userDto.dto.UserDtoName;
import com.userDto.mapper.UserMapper;
import com.userDto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
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

        User userDb = userRepository.findById(user.getId()).orElse(null);
        if(userDb != null){
            userDb.setName(user.getName());
            userDb.setSubname(user.getSubname());
            userDb.setUsername(user.getUsername());
            userDb.setPassword(user.getPassword());

            return userRepository.save(userDb);
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteUser(Long id){
        User user = userRepository.findById(id).orElse(null);
        userRepository.deleteById(id);
    }

}

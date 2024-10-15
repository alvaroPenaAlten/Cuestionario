package com.userDto.service;

import com.userDto.domain.User;
import com.userDto.dto.UserDtoName;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<UserDtoName> getAllUsers();

    public Optional<User> getUserById(Long id);

    public User updateUser(User user);

    public void deleteUser(Long id);

}

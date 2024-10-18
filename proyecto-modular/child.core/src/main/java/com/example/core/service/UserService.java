package com.example.core.service;


import com.example.core.domain.User;
import com.example.core.dto.UserDtoName;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<UserDtoName> getAllUsers();

    public Optional<User> getUserById(Long id);

    public User updateUser(User user);

    public void deleteUser(Long id);

}

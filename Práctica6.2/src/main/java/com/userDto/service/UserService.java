package com.userDto.service;

import com.userDto.dto.UserDtoName;

import java.util.List;

public interface UserService {

    public List<UserDtoName> getAllUsers();

    public UserDtoName getUserById(Long id);

}

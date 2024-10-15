package com.userDto.controller;

import com.userDto.domain.User;
import com.userDto.dto.UserDtoName;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserDtoNameController {

    public List<UserDtoName> getAllUser();

    public ResponseEntity<User> getUserDtoByID(Long id);

}

package com.userDto.controller;


import com.userDto.dto.UserDtoName;
import com.userDto.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("completeName")
public class UserDtoNameControllerImp implements UserDtoNameController{

    @Autowired
    private UserServiceImp userService;

    @Override
    @GetMapping
    public List<UserDtoName> getAllUser() {
        return userService.getAllUsers();
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserDtoName> getUserDtoByID(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }
}

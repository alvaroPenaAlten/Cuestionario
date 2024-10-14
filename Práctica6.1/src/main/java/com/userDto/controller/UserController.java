package com.userDto.controller;


import com.userDto.domain.User;
import com.userDto.domain.UserDto;
import com.userDto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserDtoByID(@PathVariable Long id){
        UserDto userDto = userService.getUserById(id);
        if(userDto != null){
            return ResponseEntity.ok(userDto);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}

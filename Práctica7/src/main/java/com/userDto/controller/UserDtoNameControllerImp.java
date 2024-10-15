package com.userDto.controller;


import com.userDto.domain.Rol;
import com.userDto.domain.User;
import com.userDto.dto.UserDtoName;
import com.userDto.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserDtoNameControllerImp implements UserDtoNameController{

    @Autowired
    private UserServiceImp userService;

    public UserDtoNameControllerImp(UserServiceImp userService) {
        this.userService = userService;
    }

    @Override
    @GetMapping
    public List<UserDtoName> getAllUser() {
        return userService.getAllUsers();
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserDtoByID(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id).get());
    }
    @Override
    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


}

package com.users.controllers;

import com.users.domain.User;
import com.users.service.Users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserRestController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public ResponseEntity<?> getUsers(){
        List<User> users = usersService.getUsers();

        return ResponseEntity.ok(users);
    }

}

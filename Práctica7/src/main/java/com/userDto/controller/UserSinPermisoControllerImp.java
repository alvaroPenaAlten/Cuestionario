package com.userDto.controller;


import com.userDto.domain.User;
import com.userDto.service.UserSinPermisoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userSinPermiso")
public class UserSinPermisoControllerImp implements  UserSinPermisoController{

    private UserSinPermisoServiceImp userSinPermisoService;

    @Autowired
    public UserSinPermisoControllerImp(UserSinPermisoServiceImp userSinPermisoService) {
        this.userSinPermisoService = userSinPermisoService;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> users = userSinPermisoService.getUserSinPermiso();
        return ResponseEntity.ok(users);
    }

}

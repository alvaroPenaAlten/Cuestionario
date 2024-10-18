package com.example.rest.controller;



import java.util.List;

import com.example.core.domain.User;
import com.example.core.service.UserSinPermisoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

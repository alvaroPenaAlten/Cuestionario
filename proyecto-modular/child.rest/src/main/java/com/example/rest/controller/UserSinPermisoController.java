package com.example.rest.controller;


import java.util.List;

import com.example.core.domain.User;
import org.springframework.http.ResponseEntity;

public interface UserSinPermisoController {

    public ResponseEntity<List<User>> getAllUser();

}

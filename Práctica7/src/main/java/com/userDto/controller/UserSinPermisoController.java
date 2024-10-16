package com.userDto.controller;

import com.userDto.domain.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserSinPermisoController {

    public ResponseEntity<List<User>> getAllUser();

}

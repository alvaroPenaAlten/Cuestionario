package com.userDto.controller;

import com.userDto.dto.UserDtoName;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserDtoNameController {

    public List<UserDtoName> getAllUser();

    public ResponseEntity<UserDtoName> getUserDtoByID(Long id);

}

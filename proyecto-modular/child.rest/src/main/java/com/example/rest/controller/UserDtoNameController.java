package com.example.rest.controller;


import java.util.List;

import com.example.core.domain.User;
import com.example.core.dto.UserDtoName;
import org.springframework.http.ResponseEntity;

public interface UserDtoNameController {

    public List<UserDtoName> getAllUser();

    public ResponseEntity<User> getUserDtoByID(Long id);

    public ResponseEntity<User> updateUser(User user);

    public ResponseEntity<User> deleteUser(Long id);

}

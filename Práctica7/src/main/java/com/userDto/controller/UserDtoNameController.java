package com.userDto.controller;

import com.userDto.domain.User;
import com.userDto.dto.UserDtoName;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserDtoNameController {

    public List<UserDtoName> getAllUser();

    public ResponseEntity<User> getUserDtoByID(Long id);

    public ResponseEntity<User> updateUser(User user);

    public ResponseEntity<User> deleteUser(Long id);

}

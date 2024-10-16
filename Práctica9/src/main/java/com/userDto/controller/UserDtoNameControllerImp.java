package com.userDto.controller;


import com.userDto.domain.Rol;
import com.userDto.domain.User;
import com.userDto.dto.UserDtoName;
import com.userDto.service.UserServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserDtoNameControllerImp implements UserDtoNameController{

    private static final Logger logger = LoggerFactory.getLogger(UserDtoNameControllerImp.class);

    @Autowired
    private UserServiceImp userService;

    public UserDtoNameControllerImp(UserServiceImp userService) {
        this.userService = userService;
    }

    @Override
    @GetMapping
    public List<UserDtoName> getAllUser() {
        logger.info("Solicitud entrante para obtener todos los usuarios.");
        List<UserDtoName> users = userService.getAllUsers();
        logger.info("Respuesta enviada con todos los usuarios.");
        return users;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserDtoByID(@PathVariable Long id) {
        logger.info("Solicitud entrante para obtener usuario by id: {}",id);
        User userbd = userService.getUserById(id).get();
        logger.info("Repuesta enviada para usuario con id: {}",id);
        return ResponseEntity.ok(userbd);
    }
    @Override
    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        logger.info("Solicitud entrante para actualizar el usuario con ID: {}", user.getId());
        User updatedUser = userService.updateUser(user);
        logger.info("Usuario actualizado con éxito. ID: {}", user.getId());
        return ResponseEntity.ok(updatedUser);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id) {
        logger.info("Solicitud entrante para eliminar usuario con ID: {}", id);
        userService.deleteUser(id);
        logger.info("Usuario con ID: {} eliminado con éxito.", id);
        return ResponseEntity.noContent().build();
    }


}

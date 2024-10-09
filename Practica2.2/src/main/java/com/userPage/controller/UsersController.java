package com.userPage.controller;

import com.userPage.domain.User;
import com.userPage.service.UserRepositori;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuarios")
public class UsersController {

    private UserRepositori userRepositori;

    public UsersController(UserRepositori userRepositori){
        this.userRepositori = userRepositori;
    }

    @GetMapping("/{numPag}/{sizePag}")
    public Page<User> getUser(@PathVariable int numPag, @PathVariable int sizePag){
        Pageable pageable = PageRequest.of(numPag,sizePag, Sort.by(Sort.Direction.DESC
                ,"name"));
        return userRepositori.findAll(pageable);
    }

}

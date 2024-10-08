package com.users.controllers;

import com.users.domain.User;
import com.users.service.Users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

    @GetMapping("/{name}")
    public ResponseEntity<?> getCliente(@PathVariable String name){
        List<User> users = usersService.getUsers();
        List<User> usersEnabled = new ArrayList<>(Arrays.asList());
        for (User c : users){
            if(c.getName().equalsIgnoreCase(name)){
                if(c.isEnabled()){
                    usersEnabled.add(c);
                }
            }
        }
        usersEnabled.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return ResponseEntity.ok(usersEnabled);
    }

}

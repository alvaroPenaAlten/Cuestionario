package com.users.controllers;

import com.users.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
public class UserRestController {

    private List<User> users = new ArrayList<>(Arrays.asList(
            new User(1,"Alvaro Peña","alvaroPena","alvapena123",true),
            new User(2,"Adrian Peña","adrianPena","adripena542",false),
            new User(3,"María José","mariajo","mariajo153",true),
            new User(4,"Carmen Pérez","carmenPe","carmen568",false),
            new User(5,"Mario Gómez","marioGomez","mario854",true)
    ));

     @GetMapping("/usuarios")
     public ResponseEntity<?> getUsers(){

     List<User> usersEnabled = new ArrayList<>(Arrays.asList());

     for(User c : users){
     if(c.isEnabled()){
     usersEnabled.add(c);
     }
     }

     return ResponseEntity.ok(usersEnabled);
     }
}

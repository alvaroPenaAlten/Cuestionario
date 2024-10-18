package com.example.rest.controller;


import java.util.List;

import com.example.core.domain.Rol;
import com.example.core.dto.RolDto;
import com.example.core.service.RolServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RolDtoControllerImp implements RolDtoController{

    @Autowired
    private RolServiceImp rolServiceImp;

    public RolDtoControllerImp(RolServiceImp rolServiceImp) {
        this.rolServiceImp = rolServiceImp;
    }

    @Override
    @GetMapping
    public List<RolDto> getAllRols() {
        return rolServiceImp.getAllRols();
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Rol> getRolById(@PathVariable Long id){
        return ResponseEntity.ok(rolServiceImp.getRolById(id).get());
    }

    @Override
    @PutMapping
    public ResponseEntity<Rol> updateUser(@RequestBody Rol rol){
        return ResponseEntity.ok(rolServiceImp.updateRol(rol));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Rol> deleteRol(@PathVariable Long id) {
        rolServiceImp.deleteRol(id);
        return ResponseEntity.noContent().build();
    }


}

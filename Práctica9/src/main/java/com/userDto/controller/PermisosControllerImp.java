package com.userDto.controller;

import com.userDto.domain.Permisos;
import com.userDto.dto.PermisosDto;
import com.userDto.service.PermisosServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permisos")
public class PermisosControllerImp implements PermisosController{

    private PermisosServiceImp permisosServiceImp;

    public PermisosControllerImp(PermisosServiceImp permisosServiceImp) {
        this.permisosServiceImp = permisosServiceImp;
    }

    @Override
    @GetMapping
    public List<PermisosDto> getAllPermisos(){
        return permisosServiceImp.getAllRols();
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Permisos> getRolById(@PathVariable Long id){
        return ResponseEntity.ok(permisosServiceImp.getPermisoById(id).get());
    }

    @Override
    @PutMapping
    public ResponseEntity<Permisos> updateUser(@RequestBody Permisos permiso){
        return ResponseEntity.ok(permisosServiceImp.updatePermiso(permiso));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Permisos> deleteRol(@PathVariable Long id) {
        permisosServiceImp.deletePermiso(id);
        return ResponseEntity.noContent().build();
    }

}

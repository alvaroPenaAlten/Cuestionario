package com.userDto.controller;

import com.userDto.dto.PermisosDto;
import com.userDto.service.PermisosServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

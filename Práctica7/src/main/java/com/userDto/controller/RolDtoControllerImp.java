package com.userDto.controller;

import com.userDto.dto.RolDto;
import com.userDto.service.RolServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}

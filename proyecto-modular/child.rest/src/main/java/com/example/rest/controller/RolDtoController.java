package com.example.rest.controller;


import java.util.List;

import com.example.core.domain.Rol;
import com.example.core.dto.RolDto;
import org.springframework.http.ResponseEntity;

public interface RolDtoController {

    public List<RolDto> getAllRols();

    public ResponseEntity<Rol> getRolById(Long id);

    public ResponseEntity<Rol> updateUser(Rol rol);

    public ResponseEntity<Rol> deleteRol(Long id);

}

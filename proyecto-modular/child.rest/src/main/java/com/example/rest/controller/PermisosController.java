package com.example.rest.controller;


import java.util.List;

import com.example.core.domain.Permisos;
import com.example.core.dto.PermisosDto;
import org.springframework.http.ResponseEntity;

public interface PermisosController {

    public List<PermisosDto> getAllPermisos();

    public ResponseEntity<Permisos> getRolById(Long id);

    public ResponseEntity<Permisos> updateUser(Permisos permiso);

    public ResponseEntity<Permisos> deleteRol(Long id);

}

package com.userDto.controller;

import com.userDto.domain.Permisos;
import com.userDto.dto.PermisosDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PermisosController {

    public List<PermisosDto> getAllPermisos();

    public ResponseEntity<Permisos> getRolById(Long id);

    public ResponseEntity<Permisos> updateUser(Permisos permiso);

    public ResponseEntity<Permisos> deleteRol(Long id);

}

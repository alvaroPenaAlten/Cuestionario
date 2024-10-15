package com.userDto.service;

import com.userDto.domain.Permisos;
import com.userDto.domain.Rol;
import com.userDto.dto.RolDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface RolService {

    public List<RolDto> getAllRols();

    public Optional<Rol> getRolById(Long id);

    public Rol updateRol(Rol rol);

    public void deleteRol(Long id);
}

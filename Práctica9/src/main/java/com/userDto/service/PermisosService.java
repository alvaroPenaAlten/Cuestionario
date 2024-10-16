package com.userDto.service;

import com.userDto.domain.Permisos;
import com.userDto.dto.PermisosDto;

import java.util.List;
import java.util.Optional;

public interface PermisosService {

    public List<PermisosDto> getAllRols();

    public Optional<Permisos> getPermisoById(Long id);

    public Permisos updatePermiso(Permisos permiso);

    public void deletePermiso(Long id);

}

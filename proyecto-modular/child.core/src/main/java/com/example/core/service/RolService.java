package com.example.core.service;


import com.example.core.domain.Rol;
import com.example.core.dto.RolDto;

import java.util.List;
import java.util.Optional;

public interface RolService {

    public List<RolDto> getAllRols();

    public Optional<Rol> getRolById(Long id);

    public Rol updateRol(Rol rol);

    public void deleteRol(Long id);
}

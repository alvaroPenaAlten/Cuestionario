package com.userDto.controller;

import com.userDto.domain.Rol;
import com.userDto.dto.RolDto;
import com.userDto.dto.UserDtoName;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RolDtoController {

    public List<RolDto> getAllRols();

    public ResponseEntity<Rol> getRolById(Long id);

    public ResponseEntity<Rol> updateUser(Rol rol);

    public ResponseEntity<Rol> deleteRol(Long id);

}

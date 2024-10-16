package com.userDto.dto;

import java.io.Serializable;
import java.util.List;

public class RolDto implements Serializable {

    private Long id;
    private String name;
    private List<PermisosDto> permisos;

    public RolDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public RolDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PermisosDto> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<PermisosDto> permisos) {
        this.permisos = permisos;
    }
}

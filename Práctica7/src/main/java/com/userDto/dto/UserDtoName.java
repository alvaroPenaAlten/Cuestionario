package com.userDto.dto;

import com.userDto.domain.Rol;

import java.io.Serializable;

public class UserDtoName implements Serializable {

    private Long id;
    private String completeName;
    private String username;
    private RolDto rol;

    public UserDtoName(Long id, String completeName, String username) {
        this.id = id;
        this.completeName = completeName;
        this.username = username;
    }

    public UserDtoName(){}

    public UserDtoName(Long id, String completeName, String username, Rol rol) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RolDto getRol() {
        return rol;
    }

    public void setRol(RolDto rol) {
        this.rol = rol;
    }
}

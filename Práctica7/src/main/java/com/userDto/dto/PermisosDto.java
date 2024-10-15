package com.userDto.dto;

import java.io.Serializable;

public class PermisosDto implements Serializable {

    private Long id;
    private String titulo;

    public PermisosDto(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public PermisosDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitle(String titulo) {
        this.titulo = titulo;
    }
}

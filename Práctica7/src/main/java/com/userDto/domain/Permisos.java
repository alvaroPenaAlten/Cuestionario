package com.userDto.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "PERMISOS")
public class Permisos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String titulo;

    @ManyToMany(mappedBy = "permisos")
    private Set<Rol> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

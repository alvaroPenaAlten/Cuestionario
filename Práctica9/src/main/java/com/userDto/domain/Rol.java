package com.userDto.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "ROLES")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rol_Name")
    private String name;

    @OneToMany(mappedBy = "rol")
    @JsonIgnore
    private Set<User> users;

    @OneToMany(mappedBy = "roleId")
    private Set<RolPermiso> rolPermisos;

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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<RolPermiso> getRolPermisos() {
        return rolPermisos;
    }

    public void setRolPermisos(Set<RolPermiso> rolPermisos) {
        this.rolPermisos = rolPermisos;
    }
}

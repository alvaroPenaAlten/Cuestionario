package com.userDto.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "ROL_PERMISOS")
@IdClass(RolPermisoId.class)
public class RolPermiso {

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    @JsonIgnore
    private Rol roleId;

    @Id
    @ManyToOne
    @JoinColumn(name = "permiso_id", nullable = false)
    private Permisos permisoId;


    public Rol getRoleId() {
        return roleId;
    }

    public void setRoleId(Rol roleId) {
        this.roleId = roleId;
    }

    public Permisos getPermisoId() {
        return permisoId;
    }

    public void setPermisoId(Permisos permisoId) {
        this.permisoId = permisoId;
    }
}

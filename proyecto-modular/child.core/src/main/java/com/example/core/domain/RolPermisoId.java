package com.example.core.domain;

import java.io.Serializable;

public class RolPermisoId implements Serializable {

    private Long roleId;
    private Long permisoId;

    public RolPermisoId(Long roleId, Long permisoId) {
        this.roleId = roleId;
        this.permisoId = permisoId;
    }

    public RolPermisoId() {
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermisoId() {
        return permisoId;
    }

    public void setPermisoId(Long permisoId) {
        this.permisoId = permisoId;
    }
}

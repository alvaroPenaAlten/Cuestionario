package com.userDto.domain;

public class UserDto {

    private Long id;
    private String name;
    private String subname;
    private String username;
    private String password;
    private Boolean enabled;

    public UserDto(Long id, String name, String subname, String username, String password, Boolean enabled) {
        this.id = id;
        this.name = name;
        this.subname = subname;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
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

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}

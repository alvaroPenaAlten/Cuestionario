package com.userDto.dto;

public class UserDtoName {

    private Long id;
    private String completeName;
    private String username;

    public UserDtoName(Long id, String completeName, String username) {
        this.id = id;
        this.completeName = completeName;
        this.username = username;
    }

    public UserDtoName(){}

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
}

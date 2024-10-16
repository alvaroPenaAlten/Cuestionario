package com.userDto.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(long id){
        super("Usuario con ID " + id + " no encontrado");
    }
    public UserNotFoundException(String message){
        super("Usuario no encontrado");
    }
}

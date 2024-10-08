package com.users.service.Users;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.users.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service()
@ConditionalOnProperty(name = "service.users", havingValue = "json")
public class UsersServiceJsonImpl implements UsersService{

    @Override
    public List<User> getUsers(){
        List<User> users;

        try{
            users = new ObjectMapper()
                    .readValue(this.getClass().getResourceAsStream("/users.json"),
                            new TypeReference<List<User>>() {});

            return users;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}

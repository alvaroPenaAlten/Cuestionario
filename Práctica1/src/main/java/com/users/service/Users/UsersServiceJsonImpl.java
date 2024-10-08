package com.users.service.Users;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.users.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@ConditionalOnProperty(name = "service.users", havingValue = "json")
public class UsersServiceJsonImpl implements UsersService{

    @Override
    public List<User> getUsers(){
        List<User> users;

        try{
            users = new ObjectMapper()
                    .readValue(this.getClass().getResourceAsStream("/users.json"),
                            new TypeReference<List<User>>(){});

            List<User> usersEnabled = new ArrayList<>(Arrays.asList());

            for (User c : users)
                if(c.isEnabled()){
                    usersEnabled.add(c);
                }
            return usersEnabled;

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}

package com.users.service.Users;


import com.users.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@ConditionalOnProperty(name = "service.users", havingValue = "list")
public class UsersServiceImpl implements UsersService{

    List<User> users = new ArrayList<>(Arrays.asList(
            new User(1,"Alvaro Peña","alvaroPena","alvapena123",true),
            new User(2,"Adrian Peña","adrianPena","adripena542",false),
            new User(3,"María José","mariajo","mariajo153",true),
            new User(4,"Carmen Pérez","carmenPe","carmen568",false),
            new User(5,"Mario Gómez","marioGomez","mario854",true)
    ));

    @Override
    public List<User> getUsers(){
        List<User> usersEnabled = new ArrayList<>(Arrays.asList());
        for (User c : users){
            if (c.isEnabled()){
                usersEnabled.add(c);
            }
        }
        return usersEnabled;
    }

}

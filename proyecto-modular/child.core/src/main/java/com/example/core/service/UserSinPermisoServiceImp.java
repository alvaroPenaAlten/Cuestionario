package com.example.core.service;


import java.util.List;
import java.util.stream.Collectors;

import com.example.core.domain.User;
import com.example.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserSinPermisoServiceImp implements UserSinPermisoService{

    private UserRepository userRepository;

    @Autowired
    public UserSinPermisoServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getUserSinPermiso(){
        List<User> users = userRepository.findAll();
        return users.stream()
                .filter(user -> user.getRol() != null && user.getRol().getRolPermisos().isEmpty())
                        .collect(Collectors.toList());
    }

}

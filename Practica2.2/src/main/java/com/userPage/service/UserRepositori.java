package com.userPage.service;

import com.userPage.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositori extends JpaRepository<User, Long> {



}

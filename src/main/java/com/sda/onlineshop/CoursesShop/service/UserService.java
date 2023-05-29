package com.sda.onlineshop.CoursesShop.service;

import com.sda.onlineshop.CoursesShop.model.constant.UserRole;
import com.sda.onlineshop.CoursesShop.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {


    Optional<User> findByEmail(String email);

    void createUser(String email, String password, UserRole role, String name ,String phoneNumber);

}

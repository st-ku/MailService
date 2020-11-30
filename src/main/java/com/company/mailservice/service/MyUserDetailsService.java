package com.company.mailservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Value("${spring.security.user.name}")
private String userName;
    @Value("${spring.security.user.password}")
private String userPassword;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User(userName, userPassword,
                new ArrayList<>());
    }
}
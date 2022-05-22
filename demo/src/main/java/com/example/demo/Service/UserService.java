package com.example.demo.Service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.demo.Model.User;

public interface UserService extends UserDetailsService{
    public User getUser(String id);
    public User addUser(User usuario);
    public User updateUser(User usuario);
    public void deleteUser(String id);
    public UserDetails loadUserByEmail(String email);
}
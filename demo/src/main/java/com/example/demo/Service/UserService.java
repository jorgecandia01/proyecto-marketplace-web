package com.example.demo.Service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import com.example.demo.Model.UserModel;

public interface UserService extends UserDetailsService{
    public UserModel getUser(String id);
    public UserModel getUserByEmail(String email);
    public UserModel addUser(UserModel usuario);
    public UserModel updateUser(UserModel usuario);
    public void deleteUser(String id);
    public UserDetails loadUserByUsername(String email);
}
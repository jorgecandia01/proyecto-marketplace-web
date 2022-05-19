package com.example.demo.Service;


import com.example.demo.Model.User;

public interface UserService{
    public User getUser(String id);
    public User addUser(User usuario);
    public User updateUser(User usuario);
    public void deleteUser(String id);
}
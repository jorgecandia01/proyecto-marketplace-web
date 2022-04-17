package com.example.demo.Service;


import com.example.demo.Model.User;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.lang.Iterable;

public interface UserService{
    public User getUser(String id);
    public User addUser(User usuario);
    public User updateUser(User usuario);
}
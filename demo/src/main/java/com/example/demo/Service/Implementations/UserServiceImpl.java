package com.example.demo.Service.Implementations;

import com.example.demo.Model.User;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.lang.Iterable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Service.UserService;

@Service
public class UserServiceImpl implements UserService {
    public User getUser(String id){return new User(1,"hola:1");};
    public User addUser(User usuario){return new User();};
    public User updateUser(User usuario){return new User();};

}
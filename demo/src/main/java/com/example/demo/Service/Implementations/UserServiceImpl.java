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
import com.example.demo.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(String id){
        User response = null;
        if(userRepository.existsById(id)){ //igual sin el parseint?? como string
            Iterable<User> users = userRepository.getUser(id);
            for(User user : users){
                response = user;
            }
            return response;
        }
        return response;
    }

    @Override
    public User addUser(User usuario){
        return userRepository.save(usuario);
    }

    @Override
    public User updateUser(User usuario){
        if(userRepository.existsById(String.valueOf(usuario.getId()))){
            return userRepository.save(usuario);
        } else {
            return null;
        }
    }

    @Override
    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

}
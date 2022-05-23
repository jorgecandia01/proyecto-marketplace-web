package com.example.demo.Service.Implementations;

import com.example.demo.Model.UserModel;
import java.lang.Iterable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.example.demo.Service.UserService;
import com.example.demo.Repository.UserRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel getUser(String id){
        UserModel response = null;
        if(userRepository.existsById(id)){
            Iterable<UserModel> users = userRepository.getUser(id);
            for(UserModel user : users){
                response = user;
            }
            return response;
        }
        return response;
    }

    @Override
    public UserModel getUserByEmail(String email){
        UserModel response = userRepository.getUserByEmail(email);//en TABLE_USER fuerzo a email a ser UNIQUE
        return response;
    }

    @Override
    public UserModel addUser(UserModel user){
        return userRepository.save(user); //con javascript ya hacemos la comprobación de que
    }                                       //ni user ni password sean nulos

    @Override
    public UserModel updateUser(UserModel user){
        if(userRepository.existsById(String.valueOf(user.getId()))){
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    @Override
    public void deleteUser(String id){
        userRepository.deleteById(id);
    }


    @Override
    public UserDetails loadUserByUsername(String username) {
        UserModel user = userRepository.findByUsername(username);
        List<GrantedAuthority> authorities = new ArrayList<>();
        UserDetails newUser = new User(user.getEmail(), user.getPassword(), authorities);
        return newUser;
    }
}

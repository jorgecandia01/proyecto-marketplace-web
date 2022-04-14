package com.example.demo.Controller;

import info.jab.microservices.model.Person;
import info.jab.microservices.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id){
        User usuario = userService.getUser(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(){
        User usuario = userService.addUser()
        return ResponseEntity.ok().body(usuario)
    }

    @PutMapping("/user")
    public ResponseEntity<User> addUser(){
        User usuario = userService.addUser()
        return ResponseEntity.ok().body(usuario)
    }
}
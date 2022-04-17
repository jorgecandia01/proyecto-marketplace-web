package com.example.demo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Service.UserService;
import com.example.demo.Model.User;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.lang.Iterable;

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
    public ResponseEntity<User> addUser(@RequestBody User usuario){
        User usuario2 = userService.addUser(usuario);
        return ResponseEntity.ok().body(usuario2);
    }

    @PutMapping("/user")
    public ResponseEntity<User> updateUser(@RequestBody User usuario){
        User usuario2 = userService.addUser(usuario);
        return ResponseEntity.ok().body(usuario2);
    }
}
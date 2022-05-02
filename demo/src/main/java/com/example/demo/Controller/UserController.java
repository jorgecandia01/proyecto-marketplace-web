package com.example.demo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
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
        usuario.setId(null); //Lo hace lombok
        User newUsuario = userService.addUser(usuario);
        return ResponseEntity.ok().body(newUsuario);
    }

    @PutMapping("/user")
    public ResponseEntity<User> updateUser(@RequestBody User usuario){
        User newUser = userService.updateUser(usuario);
        if(newUser == null){
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newUser);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
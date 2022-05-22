package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.UserService;
import com.example.demo.Model.UserModel;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<UserModel> getUser(@PathVariable String id){
        UserModel user = userService.getUser(id);
        if(user != null){
            return ResponseEntity.ok().body(user);
        } else {
            return ResponseEntity.badRequest().body(user);
        }
    }

    @PostMapping("/user")
    public ResponseEntity<UserModel> addUser(@RequestBody UserModel user){
        user.setId(null); //Lo hace lombok
        UserModel newUsuario = userService.addUser(user);
        return ResponseEntity.ok().body(newUsuario);
    }

    @PutMapping("/user")
    public ResponseEntity<UserModel> updateUser(@RequestBody UserModel user){
        UserModel newUser = userService.updateUser(user);
        if(newUser == null){
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newUser);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<UserModel> deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
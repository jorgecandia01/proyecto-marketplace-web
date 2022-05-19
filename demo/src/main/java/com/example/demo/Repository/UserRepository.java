package com.example.demo.Repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Service;

import com.example.demo.Model.User;

import java.lang.Iterable;

@Service
public interface UserRepository extends CrudRepository<User, String>{
    @Query("SELECT * FROM TABLE_USER WHERE ID= :id")
    public Iterable<User> getUser(String id);
}


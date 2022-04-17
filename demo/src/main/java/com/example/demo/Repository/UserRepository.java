package com.example.demo.Repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.User;

import java.lang.Iterable;

public interface UserRepository extends CrudRepository<User, String>{
    @Query("SELECT * FROM TABLE_USER WHERE ID= :id")
    public Iterable<User> getCarrito(int id);
}
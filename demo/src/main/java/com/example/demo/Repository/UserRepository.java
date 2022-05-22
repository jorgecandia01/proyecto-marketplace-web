package com.example.demo.Repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Service;

import com.example.demo.Model.UserModel;

import java.lang.Iterable;
import java.util.ArrayList;
import java.util.List;

@Service
public interface UserRepository extends CrudRepository<UserModel, String>{
    @Query("SELECT * FROM TABLE_USER WHERE ID= :id")
    public Iterable<UserModel> getUser(String id);

    @Query("SELECT * FROM TABLE_USER WHERE EMAIL= :email")
    public UserModel findByUsername(String email);
}


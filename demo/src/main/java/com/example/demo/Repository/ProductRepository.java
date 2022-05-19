package com.example.demo.Repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Product;

import java.lang.Iterable;

@Service
public interface ProductRepository extends CrudRepository<Product, String>{
    @Query("SELECT * FROM TABLE_PRODUCT WHERE ID= :id")
    public Iterable<Product> getProduct(String id);
}
package com.example.demo.Repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Model.Product;

import java.lang.Iterable;

@Service
public interface ProductRepository extends CrudRepository<Product, String>{
    @Query("SELECT * FROM TABLE_PRODUCT WHERE ID= :id")
    public Iterable<Product> getProduct(String id);
}
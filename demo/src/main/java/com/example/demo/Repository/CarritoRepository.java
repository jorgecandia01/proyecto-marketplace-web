package com.example.demo.Repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Carrito;

import java.lang.Iterable;

@Service
public interface CarritoRepository extends CrudRepository<Carrito, String>{
    @Query("SELECT * FROM TABLE_CARRITO WHERE ID= :id")
    public Iterable<Carrito> getCarrito(String id);
}
package com.example.demo.Service;


import com.example.demo.Model.Carrito;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.lang.Iterable;

public interface CarritoService{
    public Carrito getCarrito(String id);
    public Carrito addCarrito(Carrito usuario);
    public Carrito updateCarrito(Carrito usuario);
    public void deleteCarrito(String id);
}
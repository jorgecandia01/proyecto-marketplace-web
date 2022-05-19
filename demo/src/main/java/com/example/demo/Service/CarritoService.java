package com.example.demo.Service;


import com.example.demo.Model.Carrito;

public interface CarritoService{
    public Carrito getCarrito(String id);
    public Carrito addCarrito(Carrito usuario);
    public Carrito updateCarrito(Carrito usuario);
    public void deleteCarrito(String id);
}
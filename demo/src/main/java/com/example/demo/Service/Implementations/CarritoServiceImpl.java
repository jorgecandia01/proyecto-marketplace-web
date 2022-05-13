package com.example.demo.Service.Implementations;

import com.example.demo.Model.Carrito;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.lang.Iterable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Service.CarritoService;
import com.example.demo.Repository.CarritoRepository;

@Service
public class CarritoServiceImpl implements CarritoService {

    @Autowired
    private CarritoRepository CarritoRepository;

    @Override
    public Carrito getCarrito(String id){
        Carrito response = null;
        if(CarritoRepository.existsById(id)){
            Iterable<Carrito> Carritos = CarritoRepository.getCarrito(id);
            for(Carrito Carrito : Carritos){
                response = Carrito;
            }
            return response;
        }
        return response;
    }

    @Override
    public Carrito addCarrito(Carrito carrito){
        return CarritoRepository.save(carrito);
    }

    @Override
    public Carrito updateCarrito(Carrito carrito){
        if(CarritoRepository.existsById(String.valueOf(carrito.getId()))){
            return CarritoRepository.save(carrito);
        } else {
            return null;
        }
    }

    @Override
    public void deleteCarrito(String id){
        CarritoRepository.deleteById(id);
    }
}

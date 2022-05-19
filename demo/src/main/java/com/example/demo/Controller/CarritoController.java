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

import com.example.demo.Service.CarritoService;
import com.example.demo.Model.Carrito;


@RestController
@RequestMapping("/api/v1")
public class CarritoController {
    @Autowired
    private CarritoService carritoService;

    @GetMapping("/carrito/{id}")
    public ResponseEntity<Carrito> getCarrito(@PathVariable String id){
        Carrito carrito = carritoService.getCarrito(id);
        return ResponseEntity.ok().body(carrito);
    }

    @PostMapping("/carrito")
    public ResponseEntity<Carrito> addCarrito(@RequestBody Carrito carrito){
        carrito.setId(null); //Lo hace lombok
        Carrito newUsuario = carritoService.addCarrito(carrito);
        return ResponseEntity.ok().body(newUsuario);
    }

    @PutMapping("/carrito")
    public ResponseEntity<Carrito> updateCarrito(@RequestBody Carrito carrito){
        Carrito newCarrito = carritoService.updateCarrito(carrito);
        if(newCarrito == null){
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newCarrito);
    }

    @DeleteMapping("/carrito/{id}")
    public ResponseEntity<Carrito> deleteCarrito(@PathVariable String id){
        carritoService.deleteCarrito(id);
        return ResponseEntity.noContent().build();
    }
}
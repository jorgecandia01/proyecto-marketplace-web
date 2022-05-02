package com.example.demo.Service.Implementations;

import com.example.demo.Model.Product;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.lang.Iterable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Service.ProductService;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProduct(String id){
        Product response = null;
        if(productRepository.existsById(id)){
            Iterable<Product> products = productRepository.getProduct(id);
            for(Product product : products){
                response = product;
            }
            return response;
        }
        return response;
    }

    @Override
    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product){
        if(productRepository.existsById(String.valueOf(product.getId()))){ //si no existe devuelvo null
            return productRepository.save(product); //si hago el save directamente, si no existe lo creo
        } else {
            return null;
        }
    }

    @Override
    public void deleteProduct(String id){
        productRepository.deleteById(id);
    }

}
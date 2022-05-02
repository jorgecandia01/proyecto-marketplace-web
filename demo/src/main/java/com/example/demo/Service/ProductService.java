package com.example.demo.Service;

import com.example.demo.Model.Product;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.lang.Iterable;

public interface ProductService{
    public Product getProduct(String id);
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProduct(String id);
}
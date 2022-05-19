package com.example.demo.Service;

import com.example.demo.Model.Product;

public interface ProductService{
    public Product getProduct(String id);
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProduct(String id);
}
package com.example.demo.Models;

import com.example.demo.Model.Product;
import com.example.demo.Model.User;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProductModelTest {

    @Test
    public void checkProduct(){
        Product product = new Product();
        product.setId(6L);
        Assert.assertEquals(product.getId()==6L, true);
        product.setName("phone");
        Assert.assertEquals(product.getName().equals("phone"), true);
        product.setPrice(144.44);
        Assert.assertEquals(product.getPrice()==144.44, true);
    }
    
}

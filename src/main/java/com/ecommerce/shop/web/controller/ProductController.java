package com.ecommerce.shop.web.controller;

import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.services.ProductServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
public class ProductController {

    ProductServices productServicesImpl;
    @Autowired
    public ProductController(ProductServices productServices){

        productServicesImpl= productServices;
    }

    @GetMapping("/get-product")
    public List<Product> getAll(){
        return productServicesImpl.findAll();
    }

    @PostMapping("/save-product")
    public Product save(@RequestBody Product product){
        log.info("Product request -> {}", product);
        return productServicesImpl.save(product);


    }
}

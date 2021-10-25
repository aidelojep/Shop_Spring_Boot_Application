package com.ecommerce.shop.web.controller;

import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.services.ProductServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {

    ProductServices productServicesImpl;
    public ProductController(ProductServices productServices){

        productServicesImpl= productServices;
    }

    @GetMapping("/")
    public List<Product> getAll(){
        return productServicesImpl.findAll();
    }

    @PostMapping("/")
    public Product save(@RequestBody Product product){
        log.info("Product request -> {}", product);
        return productServicesImpl.save(product);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        productServicesImpl.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

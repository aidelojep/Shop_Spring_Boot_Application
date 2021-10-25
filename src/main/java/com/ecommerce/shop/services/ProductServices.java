package com.ecommerce.shop.services;

import com.ecommerce.shop.data.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductServices {
    Product save(Product product);
    List<Product> findAll();
    Product findById(Long id);
    void deleteById(Long id);
}

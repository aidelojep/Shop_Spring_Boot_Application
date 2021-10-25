package com.ecommerce.shop.services;

import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductServices{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product save(Product product){
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
         productRepository.deleteById(id);
    }

}

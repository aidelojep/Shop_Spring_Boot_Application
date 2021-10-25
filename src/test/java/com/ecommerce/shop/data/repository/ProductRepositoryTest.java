package com.ecommerce.shop.data.repository;

import com.ecommerce.shop.data.model.Currency;
import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.data.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.Assert.assertEquals;

@SpringBootTest
@Slf4j
@Sql(scripts = {"/db/insert.sql"})

public class ProductRepositoryTest{

    @Autowired
    ProductRepository productRepositoryImpl;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void createProductTest(){

        Product product = new Product();
        product.setName("Luxury Sofa");
        product.setPrice(1500);
        product.setCurrency(Currency.NGN);
        product.setDetails("How fr bro? Isaac get my green shirt??'");
        assertThat(product).isNotNull();
        log.info("Product before saving --> {}", product);
        productRepositoryImpl.save(product);
        log.info("Product after saving -> {}",product);

    }
    @Test
    public void whenFindAllProductIsCalledThenProductListIsReturnedTest(){

        List<Product> products = productRepositoryImpl.findAll();
        assertThat(products).hasSize(4);
        //assertEquals(4, products.size());
        log.info("Product returned from database -> {}", products);
    }
    @Test
    public void findExistingProductById(){
      Product existingProduct = productRepositoryImpl.findById(110L).orElse(null);
      assertThat(existingProduct).isNotNull();
      log.info("Product ->{}", existingProduct);
    }
    @Test
    public void deleteExistingProductById(){
          Product existingProduct = productRepositoryImpl.findById(110L).orElse(null);
          assertThat(existingProduct).isNotNull();
          productRepositoryImpl.deleteById(110L);
          assertThat(productRepositoryImpl.findById(110L).orElse(null)).isNull();
          log.info("Product -> {}", existingProduct);

    }
}
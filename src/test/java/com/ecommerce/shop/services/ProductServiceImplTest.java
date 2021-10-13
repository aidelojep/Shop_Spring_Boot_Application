package com.ecommerce.shop.services;

import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.data.repository.ProductRepository;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;


public class ProductServiceImplTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductServices productServicesImpl;

    @Before
    public void setUp() {
        productServicesImpl = new ProductServiceImpl();
        MockitoAnnotations.openMocks(this);
    }

    @After
    public void tearDown(){
    }



    @Test
   public void saveProductMockTest(){
        Product product = new Product();
        when(productServicesImpl.save(product)).thenReturn(product);
        productServicesImpl.save(product);
        verify(productRepository, times(1)).save(product);

    }
}
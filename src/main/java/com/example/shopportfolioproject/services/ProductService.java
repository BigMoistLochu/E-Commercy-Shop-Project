package com.example.shopportfolioproject.services;

import com.example.shopportfolioproject.models.Product;
import com.example.shopportfolioproject.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;


    public Product addProduct(Product product)
    {
        return productRepository.save(product);
    }


}

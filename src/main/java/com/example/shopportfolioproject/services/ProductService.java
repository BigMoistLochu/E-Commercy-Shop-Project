package com.example.shopportfolioproject.services;

import com.example.shopportfolioproject.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;




}

package com.example.shopportfolioproject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameOfProduct;

    private String description;

    private BigDecimal price;

    private boolean isAvailable;

    public Product(String nameOfProduct, String description, BigDecimal price, boolean isAvailable) {
        this.nameOfProduct = nameOfProduct;
        this.description = description;
        this.price = price;
        this.isAvailable = isAvailable;
    }
}

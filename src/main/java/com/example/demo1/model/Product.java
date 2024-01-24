package com.example.demo1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;
    private String name;
    private String description;
    private int price;
    private String dateProduct;

    public Product() {
    }

    public Product(String nameProduct, String describe, int price, String dateProduct) {
        this.name = nameProduct;
        this.description = describe;
        this.price = price;
        this.dateProduct = dateProduct;
    }

    public Product(Long id, String nameProduct, String describe, int price, String dateProduct) {
        this.idService = id;
        this.name = nameProduct;
        this.description = describe;
        this.price = price;
        this.dateProduct = dateProduct;
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDateProduct() {
        return dateProduct;
    }

    public void setDateProduct(String dateProduct) {
        this.dateProduct = dateProduct;
    }
}

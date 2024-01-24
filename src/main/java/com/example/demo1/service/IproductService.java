package com.example.demo1.service;

import com.example.demo1.model.Product;

import java.util.List;
import java.util.Optional;

public interface IproductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    void save(Product product);
    void delete(Long id);
    void edit(Product product);


}

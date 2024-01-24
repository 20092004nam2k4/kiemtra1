package com.example.demo1.service;

import com.example.demo1.model.Product;
import com.example.demo1.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService implements IproductService {
    @Autowired
    IProductRepository iStudentRepository;

    @Override
    public List<Product> findAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iStudentRepository.findById(id);
    }
    //save
    @Override
    public void save(Product student) {
        iStudentRepository.save(student);
    }
    //delete
    @Override
    public void delete(Long id) {
iStudentRepository.deleteById(id);
    }

    @Override
    public void edit( Product student) {
iStudentRepository.save(student);
    }
}

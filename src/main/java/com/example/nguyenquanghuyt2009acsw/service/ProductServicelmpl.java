package com.example.nguyenquanghuyt2009acsw.service;


import com.example.nguyenquanghuyt2009acsw.entity.ProductEntity;
import com.example.nguyenquanghuyt2009acsw.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServicelmpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Iterable<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public void remove(Long id) {

        productRepository.deleteById(id);
    }
}

package com.example.nguyenquanghuyt2009acsw.service;

import com.example.nguyenquanghuyt2009acsw.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {

    Iterable<ProductEntity> findAll();

    Optional<ProductEntity> findById(Long id);

    ProductEntity save(ProductEntity productEntity);

    void remove(Long id);
}

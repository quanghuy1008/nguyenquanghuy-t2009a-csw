package com.example.nguyenquanghuyt2009acsw.repository;

import com.example.nguyenquanghuyt2009acsw.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}

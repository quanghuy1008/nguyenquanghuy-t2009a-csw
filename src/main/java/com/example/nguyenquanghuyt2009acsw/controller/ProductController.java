package com.example.nguyenquanghuyt2009acsw.controller;

import com.example.nguyenquanghuyt2009acsw.entity.ProductEntity;
import com.example.nguyenquanghuyt2009acsw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/productsEntity")
public class ProductController {
    @Autowired
    ProductService productService;

    // Add New Products
    @PostMapping
    public ResponseEntity<ProductEntity> createNewProduct(@RequestBody ProductEntity productEntity) {
        return new ResponseEntity<>(productService.save(productEntity), HttpStatus.OK);
    }

    // Get All Products
    @GetMapping
    public ResponseEntity<Iterable<ProductEntity>> getAllProducts() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    // Get 1 Product ID
    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getProduct(@PathVariable Long id) {
        Optional<ProductEntity> productOptional = productService.findById(id)
                ;
        return productOptional.map(product -> new ResponseEntity<>(product, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Update 1 Product
    @PutMapping("/{id}")
    public ResponseEntity<ProductEntity> sellProduct(@PathVariable Long id, @RequestBody ProductEntity productEntity) {
        Optional<ProductEntity> categoryOptional = productService.findById(id)
                ;
        return categoryOptional.map(product1 -> {
            productEntity.setId(product1.getId());
            return new ResponseEntity<>(productService.save(productEntity), HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Delete A Product
    @DeleteMapping("/{id}")
    public ResponseEntity<ProductEntity> deleteProduct(@PathVariable Long id) {
        Optional<ProductEntity> categoryOptional = productService.findById(id)
                ;
        return categoryOptional.map(category -> {
            productService.remove(id)
            ;
            return new ResponseEntity<>(category, HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}

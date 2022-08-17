package com.example.nguyenquanghuyt2009acsw.entity;

import javax.persistence.*;

@Entity
@Table(name = "abcshop")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false)
    private Integer id;
    @Column(name = "name" , nullable = false)
    private String name;
    @Column(name = "price" , nullable = false)
    private String price;
    @Column(name = "quantity" , nullable = false)
    private String quantity;

    public ProductEntity(Integer id, String name, String price, String quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

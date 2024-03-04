package com.luv2code.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "sku")
    private String sku;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "unit-price")
    private BigDecimal unitPrice;
    @Column(name = "image-url")
    private String imageUrl;
    @Column(name = "active")
    private boolean active;
    @Column(name = "units-in-stock")
    private int unitsInStock;
    @Column(name = "date-created")
    private Date dateCreated;
    @Column(name = "last-updated")
    private Date lastUpdated;


}

package com.ecommerce.shop.data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    private Currency currency;
    private String details;
    @ElementCollection
    private List<String> imageURL;
    @OneToMany
    private List<Feedback> feedbacks;
}

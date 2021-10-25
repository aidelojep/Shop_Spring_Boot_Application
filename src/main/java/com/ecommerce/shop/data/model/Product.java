package com.ecommerce.shop.data.model;

import lombok.Data;
import lombok.ToString;

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
    @Column(length = 1000)
    private String details;
    @ElementCollection
    @ToString.Exclude
    private List<String> imageUrl;
    @OneToMany
    @ToString.Exclude
    private List<Feedback> feedbacks;
}

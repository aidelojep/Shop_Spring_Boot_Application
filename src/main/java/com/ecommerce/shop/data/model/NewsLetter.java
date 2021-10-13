package com.ecommerce.shop.data.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class NewsLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(unique = true)
    private String email;

}

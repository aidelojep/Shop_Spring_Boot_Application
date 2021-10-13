package com.ecommerce.shop.data.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Feedback {
    @Id
    private Long id;
    private String comment;
    private String rating;

}

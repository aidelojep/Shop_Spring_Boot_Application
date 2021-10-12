package com.ecommerce.shop;

import javax.persistence.*;

@Entity
public class Feedback {
    @Id
    private Long id;
    private String comment;
    private String rating;

}

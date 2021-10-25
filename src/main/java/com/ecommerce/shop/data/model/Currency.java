package com.ecommerce.shop.data.model;

import lombok.Getter;

@Getter
public enum Currency {
    NGN("Naira"),
    USD("Dollars"),
    GBP("Pounds"),
    FRC("Franc"),
    EURO("Euro"),
    GHC("Cedi");


    private String name;

    Currency(String s) {
        this.name=name;
    }

}


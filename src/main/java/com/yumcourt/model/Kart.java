package com.yumcourt.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Kart {
    private long id;
    private double finalPrice;
    private Customer customer;
    private Restaurant restaurant;

}

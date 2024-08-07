package com.yumcourt.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Menu {
    private long id;
    private String name;
    private String description;
    private double price;
    private Restaurant restaurant;
    private boolean availability;

}

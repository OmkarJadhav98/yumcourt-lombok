package com.yumcourt.model;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Order {
    private long id;
    private Customer customer;
    private Menu menu;
    private DeliveryExecutive deliveryExecutive;
    private LocalDateTime timestamp;

}

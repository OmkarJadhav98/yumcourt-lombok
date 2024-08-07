package com.yumcourt.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    private long id;
    private String name;
    private long flatNo;
    private String buildingName;
    private String street;
    private String city;
    private long pinCode;
    private String state;

}

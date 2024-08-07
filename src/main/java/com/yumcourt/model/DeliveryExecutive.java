package com.yumcourt.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class DeliveryExecutive {
    private long id;
    private String name;
    private long phoneNo;
    private boolean isAvailable;

}

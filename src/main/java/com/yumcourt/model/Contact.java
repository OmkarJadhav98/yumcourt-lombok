package com.yumcourt.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Contact {
    private long id;
    private long phone;
    private Address address;

}

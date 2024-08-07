package com.yumcourt.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
    private long id;
    private String name;
    private String email;
    private String password;
    private Contact contact;

}

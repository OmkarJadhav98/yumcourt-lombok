package com.yumcourt.model;

import java.util.List;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private long id;
    private String name;
    private Contact contact;
    private List<Menu> menus;

}

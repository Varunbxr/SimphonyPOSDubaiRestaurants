package com.simphony.pos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Condiments {
    Integer id;
    String name;
    Integer price;
    Integer quantity;

}

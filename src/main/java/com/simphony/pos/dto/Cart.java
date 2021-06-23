package com.simphony.pos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    Integer itemId;
    String name;
    Integer price;
    Integer itemQty;
    Integer totalPrice;
    List<Condiments> condimentList;
    String comment;

}

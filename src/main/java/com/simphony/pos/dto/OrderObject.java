package com.simphony.pos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderObject {


    BigInteger orderPrice;
    LocalDate createdAt;
    LocalDate updatedAt;
    List<Cart> cart;


}

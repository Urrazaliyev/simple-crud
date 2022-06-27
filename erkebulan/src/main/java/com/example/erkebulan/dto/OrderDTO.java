package com.example.erkebulan.dto;

import com.example.erkebulan.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTO {
    private Long id;
    private long number;
    private Long customerId;
    private List<Product> products;
}

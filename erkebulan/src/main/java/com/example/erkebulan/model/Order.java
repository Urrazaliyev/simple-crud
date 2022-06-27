package com.example.erkebulan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private long id;

    @Column(name = "number")
    private long number;

    @Column(name = "customer_id")
    private long customerId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_order", referencedColumnName = "id")
    private List<Product> productList = new ArrayList<>();
}

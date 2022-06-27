package com.example.erkebulan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_customer", referencedColumnName = "id")
    List<Order> orderList = new ArrayList<>();
}

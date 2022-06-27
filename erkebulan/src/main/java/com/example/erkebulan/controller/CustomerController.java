package com.example.erkebulan.controller;


import com.example.erkebulan.model.Customer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.erkebulan.service.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {


    private final CustomerService customerService;

    @GetMapping()
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable long id) {
        return customerService.getById(id);
    }

    @PostMapping()
    public void saveCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @PutMapping()
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        customerService.deleteCustomerById(id);
    }
}


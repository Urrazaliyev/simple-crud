package com.example.erkebulan.service;

import com.example.erkebulan.model.Customer;
import com.example.erkebulan.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Optional<Customer> getById(long id) {
        return repository.findById(id);
    }

    public void addCustomer(Customer customer) {
        repository.save(customer);
    }

    public void updateCustomer(Customer customer) {
        repository.save(customer);
    }

    public void deleteCustomerById(long id) {
        repository.deleteById(id);
    }

}

package com.example.erkebulan.service;

import com.example.erkebulan.model.Order;
import com.example.erkebulan.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> getCustomersOrder(long id) {
        List<Order> orders = new ArrayList<>();
        for (Order i : orderRepository.findAll()) {
            if (id == i.getCustomerId())
                orders.add(i);
        }
        return orders;
    }

    public Optional<Order> getByNumber(long id) {
        return orderRepository.findById(id);
    }

    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    public void add(Order order) {
        orderRepository.save(order);
    }

    public void update(Order order) {
        orderRepository.save(order);
    }

    public void deleteById(long number) {
        orderRepository.deleteById(number);
    }


}

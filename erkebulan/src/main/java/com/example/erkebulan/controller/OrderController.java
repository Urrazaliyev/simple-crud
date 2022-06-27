package com.example.erkebulan.controller;

import com.example.erkebulan.model.Order;
import com.example.erkebulan.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/customer/{id}")
    public List<Order> getCustomersOrderById(@PathVariable long id) {
        return orderService.getCustomersOrder(id);
    }

    @GetMapping()







    public List<Order> getAllOrderByCustomer() {
        return orderService.getAllOrder();
    }

    @GetMapping("{id}")
    public Optional<Order> getById(@PathVariable long id) {
        return orderService.getByNumber(id);
    }

    @PostMapping()
    public void add(@RequestBody Order order) {
        orderService.add(order);
    }


    @PutMapping()
    public void update(@RequestBody Order order) {
        orderService.update(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        orderService.deleteById(id);
    }


}

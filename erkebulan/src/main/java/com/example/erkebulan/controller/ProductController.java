package com.example.erkebulan.controller;

import com.example.erkebulan.model.Product;
import com.example.erkebulan.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/order/{id}")
    public List<Product> getOrdersProduct(@PathVariable long id) {
        return productService.ordersProduct(id);
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @PostMapping()
    public void add(@RequestBody Product product) {
        productService.add(product);
    }

    @PutMapping()
    public void update(@RequestBody Product product) {
        productService.update(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        productService.deleteById(id);
    }


}

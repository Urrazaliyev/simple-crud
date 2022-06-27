package com.example.erkebulan.service;

import com.example.erkebulan.model.Product;
import com.example.erkebulan.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> ordersProduct(long id) {
        List<Product> products = new ArrayList<>();
        for (Product product : productRepository.findAll()) {
            if (id == product.getOrderId()) products.add(product);
        }
        return products;
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public void add(Product product) {
        productRepository.save(product);
    }

    public void update(Product product) {
        productRepository.save(product);
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

}

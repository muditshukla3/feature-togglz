package com.ms.service;

import com.ms.dto.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProductService {

    private static List<Product> products = Stream.of(new Product(1, "iPhone 11", 50000),
                    new Product(4, "Macbook Pro", 150000),
                    new Product(1, "Apple Watch", 30000),
                    new Product(1, "iPad", 65000))
            .collect(Collectors.toList());
    public List<Product> getAllProducts(){
        return this.products;
    }

    public List<Product> getDiscountedProducts(){
        List<Product> productAfterDiscount = new ArrayList<>();
        this.products.forEach(product -> {
                    product.setPrice(product.getPrice() - (product.getPrice() *5 / 100));
                    productAfterDiscount.add(product);
                }
        );
        return productAfterDiscount;
    }
}

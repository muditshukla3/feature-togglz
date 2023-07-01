package com.ms.service;

import com.ms.dto.Product;
import com.ms.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getDiscountedProducts(List<Product> productsForDiscount){
        List<Product> productAfterDiscount = new ArrayList<>();
        productsForDiscount.forEach(product -> {
                    product.setPrice(product.getPrice() - (product.getPrice() *5 / 100));
                    productAfterDiscount.add(product);
                }
        );
        return productAfterDiscount;
    }
}

package com.ms.controller;

import com.ms.dto.Product;
import com.ms.service.ProductService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductController {

    private final FeatureManager featureManager;

    public static final Feature discount_applied = new NamedFeature("DISCOUNT_APPLIED");
    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        if (featureManager.isActive(discount_applied)){
            return productService.getDiscountedProducts(productService.getAllProducts());
        }
        return productService.getAllProducts();
    }
}

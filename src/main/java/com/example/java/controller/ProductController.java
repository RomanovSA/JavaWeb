package com.example.java.controller;

import com.example.java.domain.Product;
import com.example.java.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ProductController
{
    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/baseProduct")
    public String baseProduct(Map<String,Object> model)
    {
        Iterable<Product> products = productRepo.findAll();
        model.put("products", products);
        return "baseProduct";
    }

    @PostMapping("/baseProduct")
    public String addProduct(@RequestParam String product_name, @RequestParam Float price, @RequestParam Long vendor_code, @RequestParam Long quantity,  Map<String, Object> model)
    {
        Product product = new Product(product_name, price, vendor_code, quantity);

        productRepo.save(product);
        Iterable<Product> products = productRepo.findAll();
        model.put("products", products);
        return "baseProduct";
    }
}

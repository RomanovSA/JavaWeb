package com.example.java.controller;

import com.example.java.domain.SaleOfProduct;
import com.example.java.repos.SaleOfProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class SaleOfProductControler
{
    @Autowired
    private SaleOfProductRepo saleOfProductRepo;

    @GetMapping("/baseSaleOfProduct")
    public String baseSaleOfProduct(Map<String, Object> model)
    {
        Iterable<SaleOfProduct> saleOfProducts = saleOfProductRepo.findAll();
        model.put("saleOfProducts", saleOfProducts);
        return "baseSaleOfProduct";
    }

    @PostMapping("/baseSaleOfProduct")
    public String addSaleOfProduct(@RequestParam Long date_purchase, @RequestParam Long total_cost, Map<String, Object> model)
    {
        SaleOfProduct saleOfProduct = new SaleOfProduct(date_purchase, total_cost);

        saleOfProductRepo.save(saleOfProduct);
        Iterable<SaleOfProduct> saleOfProducts = saleOfProductRepo.findAll();
        model.put("saleOfProducts", saleOfProducts);
        return "baseSaleOfProduct";
    }
}

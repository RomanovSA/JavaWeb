package com.example.java.controller;

import com.example.java.domain.Customer;
import com.example.java.domain.Provider;
import com.example.java.domain.Saloon;
import com.example.java.repos.CustomerRepo;
import com.example.java.repos.ProviderRepo;
import com.example.java.repos.SaloonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController
{
    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/")
    public String greeting(Map<String, Object> model)
    {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model)
    {
        Iterable<Customer> customers = customerRepo.findAll();
        model.put("customers", customers);
        return "main";
    }

    @PostMapping("/main")
    public String addCustomer(@RequestParam String customer_name, @RequestParam Long customer_phone_number, @RequestParam String customer_email, Map<String, Object> model)
    {
        Customer customer = new Customer(customer_name, customer_phone_number, customer_email);

        customerRepo.save(customer);
        Iterable<Customer> customers = customerRepo.findAll();
        model.put("customers", customers);
        return "main";
    }
}
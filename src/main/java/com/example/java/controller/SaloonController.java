package com.example.java.controller;

import com.example.java.domain.Saloon;
import com.example.java.repos.SaloonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class SaloonController
{
    @Autowired
    private SaloonRepo saloonRepo;

    @GetMapping("/baseSaloon")
    public String baseSaloon(Map<String, Object> model)
    {
        Iterable<Saloon> saloons = saloonRepo.findAll();
        model.put("saloons", saloons);
        return "baseSaloon";
    }

    @PostMapping("/baseSaloon")
    public String addSaloon(@RequestParam String saloon_name, @RequestParam String saloon_address, @RequestParam Long saloon_phone_number, @RequestParam String saloon_email, Map<String, Object> model)
    {
        Saloon saloon = new Saloon(saloon_name, saloon_address, saloon_phone_number, saloon_email);

        saloonRepo.save(saloon);
        Iterable<Saloon> saloons = saloonRepo.findAll();
        model.put("saloons", saloons);
        return "baseSaloon";
    }
}

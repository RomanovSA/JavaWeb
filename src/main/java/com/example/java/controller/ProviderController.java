package com.example.java.controller;

import com.example.java.domain.Provider;
import com.example.java.repos.ProviderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ProviderController
{
    @Autowired
    private ProviderRepo providerRepo;

    @GetMapping("/baseProvider")
    public String baseProvider(Map<String, Object> model)
    {
        Iterable<Provider> providers = providerRepo.findAll();
        model.put("providers", providers);
        return "baseProvider";
    }

    @PostMapping("/baseProvider")
    public String addProvider(@RequestParam String provider_name, @RequestParam String provider_address, @RequestParam Long provider_phone_number, @RequestParam Long contract_number, Map<String, Object> model)
    {
        Provider provider = new Provider(provider_name, provider_address, provider_phone_number, contract_number);

        providerRepo.save(provider);
        Iterable<Provider> providers = providerRepo.findAll();
        model.put("providers", providers);
        return "baseProvider";
    }
}

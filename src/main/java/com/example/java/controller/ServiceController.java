package com.example.java.controller;

import com.example.java.domain.Service;
import com.example.java.repos.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ServiceController
{
    @Autowired
    private ServiceRepo serviceRepo;

    @GetMapping("/baseService")
    public String baseService(Map<String, Object> model)
    {
        Iterable<Service> services = serviceRepo.findAll();
        model.put("services", services);
        return "baseService";
    }

    @PostMapping("/baseService")
    public String addService(@RequestParam String service_name, @RequestParam Long cost, Map<String, Object> model)
    {
        Service service = new Service(service_name, cost);

        serviceRepo.save(service);
        Iterable<Service> services = serviceRepo.findAll();
        model.put("services", services);
        return "baseService";
    }
}

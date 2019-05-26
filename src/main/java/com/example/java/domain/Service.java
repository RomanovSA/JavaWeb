package com.example.java.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String service_name;
    private Long cost;

    public Service() {
    }

    public Service(String service_name, Long cost) {
        this.service_name = service_name;
        this.cost = cost;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }
}

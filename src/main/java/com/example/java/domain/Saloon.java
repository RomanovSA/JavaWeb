package com.example.java.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Saloon
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_provider;

    private String saloon_name;
    private String saloon_address;
    private Long saloon_phone_number;
    private String saloon_email;

    public Saloon() {
    }

    public Saloon(String saloon_name, String saloon_address, Long saloon_phone_number, String saloon_email) {
        this.saloon_name = saloon_name;
        this.saloon_address = saloon_address;
        this.saloon_phone_number = saloon_phone_number;
        this.saloon_email = saloon_email;
    }

    public Long getId_provider() {
        return id_provider;
    }

    public void setId_provider(Long id_provider) {
        this.id_provider = id_provider;
    }

    public String getSaloon_name() {
        return saloon_name;
    }

    public void setSaloon_name(String saloon_name) {
        this.saloon_name = saloon_name;
    }

    public String getSaloon_address() {
        return saloon_address;
    }

    public void setSaloon_address(String saloon_address) {
        this.saloon_address = saloon_address;
    }

    public Long getSaloon_phone_number() {
        return saloon_phone_number;
    }

    public void setSaloon_phone_number(Long saloon_phone_number) {
        this.saloon_phone_number = saloon_phone_number;
    }

    public String getSaloon_email() {
        return saloon_email;
    }

    public void setSaloon_email(String saloon_email) {
        this.saloon_email = saloon_email;
    }
}

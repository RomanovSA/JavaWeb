package com.example.java.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Provider
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_saloon;

    private String provider_name;
    private String provider_address;
    private Long provider_phone_number;
    private Long contract_number;

    public Provider() {
    }

    public Provider(String provider_name, String provider_address, Long provider_phone_number, Long contract_number) {
        this.provider_name = provider_name;
        this.provider_address = provider_address;
        this.provider_phone_number = provider_phone_number;
        this.contract_number = contract_number;
    }

    public Long getId_saloon() {
        return id_saloon;
    }

    public void setId_saloon(Long id_saloon) {
        this.id_saloon = id_saloon;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public String getProvider_address() {
        return provider_address;
    }

    public void setProvider_address(String provider_address) {
        this.provider_address = provider_address;
    }

    public Long getProvider_phone_number() {
        return provider_phone_number;
    }

    public void setProvider_phone_number(Long provider_phone_number) {
        this.provider_phone_number = provider_phone_number;
    }

    public Long getContract_number() {
        return contract_number;
    }

    public void setContract_number(Long contract_number) {
        this.contract_number = contract_number;
    }
}

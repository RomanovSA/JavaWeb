package com.example.java.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_saloon;

    private String customer_name;
    private Long customer_phone_number;
    private String customer_email;

    public Customer(String customer_name, Long customer_phone_number, String customer_email) {
        this.customer_name = customer_name;
        this.customer_phone_number = customer_phone_number;
        this.customer_email = customer_email;
    }

    public Integer getId_saloon() {
        return id_saloon;
    }

    public void setId_saloon(Integer id_saloon) {
        this.id_saloon = id_saloon;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Long getCustomer_phone_number() {
        return customer_phone_number;
    }

    public void setCustomer_phone_number(Long customer_phone_number) {
        this.customer_phone_number = customer_phone_number;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }
}

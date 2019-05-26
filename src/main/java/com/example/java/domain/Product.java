package com.example.java.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_provider;
    private Long id_saloon;

    private String product_name;
    private Float price;
    private Long vendor_code;
    private Long quantity;

    public Product() {
    }

    public Product(String product_name, Float price, Long vendor_code, Long quantity) {
        this.product_name = product_name;
        this.price = price;
        this.vendor_code = vendor_code;
        this.quantity = quantity;
    }

    public Long getId_provider() {
        return id_provider;
    }

    public void setId_provider(Long id_provider) {
        this.id_provider = id_provider;
    }

    public Long getId_saloon() {
        return id_saloon;
    }

    public void setId_saloon(Long id_saloon) {
        this.id_saloon = id_saloon;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getVendor_code() {
        return vendor_code;
    }

    public void setVendor_code(Long vendor_code) {
        this.vendor_code = vendor_code;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}

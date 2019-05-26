package com.example.java.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaleOfProduct
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_customer;
    private Long id_product;
    private Long id_employee;

    private Long date_purchase;
    private Long total_cost;

    public SaleOfProduct() {
    }

    public SaleOfProduct(Long date_purchase, Long total_cost) {
        this.date_purchase = date_purchase;
        this.total_cost = total_cost;
    }

    public Long getId_customer() {
        return id_customer;
    }

    public void setId_customer(Long id_customer) {
        this.id_customer = id_customer;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public Long getId_employee() {
        return id_employee;
    }

    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
    }

    public Long getDate_purchase() {
        return date_purchase;
    }

    public void setDate_purchase(Long date_purchase) {
        this.date_purchase = date_purchase;
    }

    public Long getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(Long total_cost) {
        this.total_cost = total_cost;
    }
}

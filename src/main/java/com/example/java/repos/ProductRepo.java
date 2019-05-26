package com.example.java.repos;

import com.example.java.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Integer>
{
}

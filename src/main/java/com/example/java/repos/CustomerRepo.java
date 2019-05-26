package com.example.java.repos;

import com.example.java.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Integer>
{
}

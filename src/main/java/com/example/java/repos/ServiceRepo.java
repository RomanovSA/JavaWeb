package com.example.java.repos;

import com.example.java.domain.Customer;
import com.example.java.domain.Service;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepo extends CrudRepository<Service, Integer> {
}

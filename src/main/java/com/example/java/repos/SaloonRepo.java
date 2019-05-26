package com.example.java.repos;

import com.example.java.domain.Saloon;
import org.springframework.data.repository.CrudRepository;

public interface SaloonRepo extends CrudRepository<Saloon, Integer>
{
}

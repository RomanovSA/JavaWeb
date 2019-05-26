package com.example.java.repos;

import com.example.java.domain.Customer;
import com.example.java.domain.Record;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepo extends CrudRepository<Record, Integer> {
}

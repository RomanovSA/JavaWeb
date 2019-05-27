package com.example.java.repos;

import com.example.java.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long>
    {
        User findByUsername(String username);
    }

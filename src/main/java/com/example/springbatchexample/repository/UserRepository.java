package com.example.springbatchexample.repository;

import com.example.springbatchexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author brunorocha
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}

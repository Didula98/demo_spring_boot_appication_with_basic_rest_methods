package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
    
    @Query(value = "SELECT * FROM user WHERE id = ?1", nativeQuery = true)
    User getUserById(String userId);

    @Query(value = "SELECT * FROM user WHERE id = ?1 AND address = ?2", nativeQuery = true)
    User getUserByIdAndAddress(String userId, String address);
}

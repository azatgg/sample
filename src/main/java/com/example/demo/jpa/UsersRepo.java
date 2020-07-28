package com.example.demo.jpa;

import com.example.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface UsersRepo extends JpaRepository<Users, Serializable> {
    List<Users> findByFirstName(String firstName);
}

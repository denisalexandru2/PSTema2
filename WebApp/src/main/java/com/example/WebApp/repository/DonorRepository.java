package com.example.WebApp.repository;

import com.example.WebApp.entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DonorRepository extends JpaRepository<Donor, UUID> {
    Donor findByEmail(String email);
    Donor findByEmailAndPassword(String email, String password);
}

package com.example.userservice.repositories;

import com.example.userservice.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    Address findById(Integer Id);
}

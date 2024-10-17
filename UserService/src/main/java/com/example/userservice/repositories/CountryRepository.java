package com.example.userservice.repositories;

import com.example.userservice.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findById(Integer id);
}

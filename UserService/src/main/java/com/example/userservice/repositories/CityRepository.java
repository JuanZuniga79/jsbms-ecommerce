package com.example.userservice.repositories;

import com.example.userservice.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    City findById(Integer id);
}

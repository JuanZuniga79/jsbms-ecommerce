package com.example.userservice.services;

import com.example.userservice.models.City;
import com.example.userservice.repositories.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServices {

    @Autowired
    private final CityRepository cityRepository;

    public void saveCity(City city) {
        cityRepository.save(city);
    }
}

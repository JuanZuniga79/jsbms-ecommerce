package com.example.userservice.services;

import com.example.userservice.models.Address;
import com.example.userservice.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServices {

    @Autowired
    private final AddressRepository addressRepository;

    public void saveAddress(Address address) {
        addressRepository.save(address);
    }
}

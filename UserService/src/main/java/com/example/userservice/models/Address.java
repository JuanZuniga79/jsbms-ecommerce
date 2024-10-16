package com.example.userservice.models;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public String address;
    @ManyToOne
    public City city;
}

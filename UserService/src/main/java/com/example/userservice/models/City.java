package com.example.userservice.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cities")
@Data
public class City {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public String name;
    @ManyToOne
    public Country country;
}

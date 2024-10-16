package com.example.userservice.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Countries")
@Data
public class Country {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    @Column(unique = true, length = 255)
    public String name;
    @Column(unique = true, length = 6)
    public String code;
}

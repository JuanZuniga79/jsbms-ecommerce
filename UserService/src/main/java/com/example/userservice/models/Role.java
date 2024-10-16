package com.example.userservice.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @Column(unique = true)
    public String name;
    @Column(nullable = true)
    public String description;
}

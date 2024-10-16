package com.example.userservice.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;
    @Column(length = 128)
    public String firstName;
    @Column(length = 128)
    public String lastName;
    @Column(length = 64, unique = true)
    public String username;
    @Column(length = 128, unique = true)
    public String email;
    @Column(length = 512)
    public String password;
    @OneToOne(cascade = CascadeType.PERSIST)
    public Address address;
    @ManyToOne
    public Role role;
}

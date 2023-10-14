package com.example.banco.domain.endereco;

import com.example.banco.domain.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String zipCode;

    private String neighborhood;

    private String city;

    private String state;

    private String number;

    private String complement;

    private String country;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}

package com.superhan.dvdrentalspringbootbackend.address.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "country_id", nullable = false)
    private Integer id;

    @Column(name = "country")
    private String country;
}
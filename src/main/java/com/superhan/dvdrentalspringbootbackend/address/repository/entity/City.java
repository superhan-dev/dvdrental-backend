package com.superhan.dvdrentalspringbootbackend.address.repository.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "city_id", nullable = false)
    private Integer id;

    @Column(name = "city")
    private String city;

}
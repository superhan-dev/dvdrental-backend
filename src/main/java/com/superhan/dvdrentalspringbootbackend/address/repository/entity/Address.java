package com.superhan.dvdrentalspringbootbackend.address.repository.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id", nullable = false)
    private Integer id;

    @Column(name = "address")
    private String address;
    @Column(name = "address2")
    private String address2;
    @Column(name = "district")
    private String district;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "phone")
    private String phone;

    @ManyToOne(targetEntity = City.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

}
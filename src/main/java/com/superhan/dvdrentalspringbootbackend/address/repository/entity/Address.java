package com.superhan.dvdrentalspringbootbackend.address.repository.entity;

import com.superhan.dvdrentalspringbootbackend.customer.repository.entity.Customer;
import com.superhan.dvdrentalspringbootbackend.staff.repository.entity.Staff;
import com.superhan.dvdrentalspringbootbackend.store.repository.entity.Store;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

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

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}
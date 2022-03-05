package com.superhan.dvdrentalspringbootbackend.store.repository.entity;

import com.superhan.dvdrentalspringbootbackend.address.repository.entity.Address;
import com.superhan.dvdrentalspringbootbackend.staff.repository.entity.Staff;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "store_id", nullable = false)
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "manager_staff_id")
    private Staff managerStaff;
}
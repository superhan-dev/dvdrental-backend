package com.superhan.dvdrentalspringbootbackend.rental.repository.entity;

import com.superhan.dvdrentalspringbootbackend.customer.repository.entity.Customer;
import com.superhan.dvdrentalspringbootbackend.inventory.repository.entity.Inventory;
import com.superhan.dvdrentalspringbootbackend.staff.repository.entity.Staff;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rental")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rental_id", nullable = false)
    private Integer id;

    @Column(name = "rental_date")
    private LocalDate rentalDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @ManyToOne(targetEntity = Customer.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(targetEntity = Inventory.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    @ManyToOne(targetEntity = Staff.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id")
    private Staff staff;

}
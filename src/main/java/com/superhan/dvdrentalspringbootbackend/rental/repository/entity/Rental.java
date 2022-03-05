package com.superhan.dvdrentalspringbootbackend.rental.repository.entity;

import com.superhan.dvdrentalspringbootbackend.customer.repository.entity.Customer;
import com.superhan.dvdrentalspringbootbackend.inventory.repository.entity.Inventory;
import com.superhan.dvdrentalspringbootbackend.payment.repository.Payment;
import com.superhan.dvdrentalspringbootbackend.staff.repository.entity.Staff;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private Long id;

    private LocalDateTime rentalDate;
    private Integer inventoryId;
    private Integer customerId;
    private LocalDateTime returnDate;
    private Integer staffId;
    private LocalDateTime lastUpdate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;


    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
}
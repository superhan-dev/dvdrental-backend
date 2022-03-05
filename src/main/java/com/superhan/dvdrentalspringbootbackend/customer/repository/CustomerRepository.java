package com.superhan.dvdrentalspringbootbackend.customer.repository;

import com.superhan.dvdrentalspringbootbackend.customer.repository.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer.Customer, Long> {
}
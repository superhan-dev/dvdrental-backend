package com.superhan.dvdrentalspringbootbackend.customer.repository;

import com.superhan.dvdrentalspringbootbackend.customer.repository.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @EntityGraph(attributePaths = {"address"})
    Page<Customer> findAll(Pageable pageable);
}
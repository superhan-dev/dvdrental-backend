package com.superhan.dvdrentalspringbootbackend.customer.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import com.superhan.dvdrentalspringbootbackend.customer.repository.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

  @EntityGraph(attributePaths = {
      "store",
      "address",
      "address.city",
      "store.address",
      "store.managerStaff",
      "store.address.city"
  })
  Page<Customer> findAll(Pageable pageable);
}

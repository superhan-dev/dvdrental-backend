package com.superhan.dvdrentalspringbootbackend.rental.repository;

import com.superhan.dvdrentalspringbootbackend.rental.repository.entity.Rental;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Integer> {

    @EntityGraph(attributePaths = {"customer","inventory","staff"})
    Page<Rental> findAll(Pageable pageable);
}
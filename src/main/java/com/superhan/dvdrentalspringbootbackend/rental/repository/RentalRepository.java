package com.superhan.dvdrentalspringbootbackend.rental.repository;

import com.superhan.dvdrentalspringbootbackend.rental.repository.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
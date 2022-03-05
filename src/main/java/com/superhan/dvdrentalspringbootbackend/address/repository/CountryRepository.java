package com.superhan.dvdrentalspringbootbackend.address.repository;

import com.superhan.dvdrentalspringbootbackend.address.repository.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
package com.superhan.dvdrentalspringbootbackend.address.repository;

import com.superhan.dvdrentalspringbootbackend.address.repository.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
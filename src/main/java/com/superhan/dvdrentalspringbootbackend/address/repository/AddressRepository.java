package com.superhan.dvdrentalspringbootbackend.address.repository;

import com.superhan.dvdrentalspringbootbackend.address.repository.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
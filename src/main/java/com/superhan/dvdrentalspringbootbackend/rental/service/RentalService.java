package com.superhan.dvdrentalspringbootbackend.rental.service;

import com.superhan.dvdrentalspringbootbackend.rental.repository.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalService {
    private final RentalRepository rentalRepository;


}

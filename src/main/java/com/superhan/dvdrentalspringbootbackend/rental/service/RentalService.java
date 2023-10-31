package com.superhan.dvdrentalspringbootbackend.rental.service;

import com.superhan.dvdrentalspringbootbackend.rental.dto.RentalDto;
import com.superhan.dvdrentalspringbootbackend.rental.model.RentalMapper;
import com.superhan.dvdrentalspringbootbackend.rental.repository.RentalRepository;
import com.superhan.dvdrentalspringbootbackend.rental.repository.entity.Rental;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalService {
    private final RentalRepository rentalRepository;

    public Page<RentalDto.Detail> getRentalList(Pageable pageable) {
        Page<Rental> rentalPage = rentalRepository.findAll(pageable);

        return rentalPage.map(RentalMapper::rentalToDto);
    }
}

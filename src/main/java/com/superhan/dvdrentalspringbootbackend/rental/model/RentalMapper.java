package com.superhan.dvdrentalspringbootbackend.rental.model;

import com.superhan.dvdrentalspringbootbackend.rental.controller.dto.RentalDto;
import com.superhan.dvdrentalspringbootbackend.rental.repository.entity.Rental;

public class RentalMapper {

    public static RentalDto.Detail rentalToDto(Rental rental) {
        return RentalDto.Detail.builder()
                .id(rental.getId())
                .rentalDate(rental.getRentalDate())
                .returnDate(rental.getReturnDate())
                .customer(rental.getCustomer())
                .inventory(rental.getInventory())
                .staff(rental.getStaff())
                .build();
    }
}

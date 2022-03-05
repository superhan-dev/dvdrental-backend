package com.superhan.dvdrentalspringbootbackend.rental.controller;

import com.superhan.dvdrentalspringbootbackend.rental.controller.dto.RentalDto;
import com.superhan.dvdrentalspringbootbackend.rental.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/rentals")
@RequiredArgsConstructor
public class RentalController {
    private final RentalService rentalService;

    @GetMapping(value = "/list")
    public Page<RentalDto.Detail> getRentalList(Pageable pageable){
        return rentalService.getRentalList(pageable);
    }
}

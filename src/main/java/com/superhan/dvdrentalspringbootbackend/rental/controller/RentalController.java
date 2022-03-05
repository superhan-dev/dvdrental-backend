package com.superhan.dvdrentalspringbootbackend.rental.controller;

import com.superhan.dvdrentalspringbootbackend.rental.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/rental")
@RequiredArgsConstructor
public class RentalController {
    private final RentalService rentalService;


}

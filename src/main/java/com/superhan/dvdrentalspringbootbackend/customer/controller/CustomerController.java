package com.superhan.dvdrentalspringbootbackend.customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superhan.dvdrentalspringbootbackend.customer.dto.CustomerDto;
import com.superhan.dvdrentalspringbootbackend.customer.service.CustomerService;
import com.superhan.dvdrentalspringbootbackend.rental.dto.RentalDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/v1/api/customer")
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService customerService;

  @Operation(summary = "List of Customers", description = "the list of customers", tags = { "CustomerController" })
  @ApiResponses({
      @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = CustomerDto.Detail.class))),
      @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
      @ApiResponse(responseCode = "404", description = "NOT FOUND"),
      @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
  })
  @GetMapping(value = "/list")
  public Page<CustomerDto.Detail> getCustomerList(Pageable pageable) {
    return customerService.getCustomerList(pageable);
  }

}

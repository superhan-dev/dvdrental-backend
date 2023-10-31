package com.superhan.dvdrentalspringbootbackend.customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superhan.dvdrentalspringbootbackend.customer.dto.CustomerDto;
import com.superhan.dvdrentalspringbootbackend.customer.service.CustomerService;

import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/api/customer")
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping(value = "/list")
  public Page<CustomerDto.Detail> getCustomerList(Pageable pageable) {
    return customerService.getCustomerList(pageable);
  }

}

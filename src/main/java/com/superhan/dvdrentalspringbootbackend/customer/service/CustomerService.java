package com.superhan.dvdrentalspringbootbackend.customer.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.superhan.dvdrentalspringbootbackend.customer.dto.CustomerDto;
import com.superhan.dvdrentalspringbootbackend.customer.model.CustomerMapper;
import com.superhan.dvdrentalspringbootbackend.customer.repository.CustomerRepository;
import com.superhan.dvdrentalspringbootbackend.customer.repository.entity.Customer;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
  private final CustomerRepository customerRepository;

  public Page<CustomerDto.Detail> getCustomerList(Pageable pageable) {
    Page<Customer> customerPage = customerRepository.findAll(pageable);

    return customerPage.map(CustomerMapper::customerToDto);
  }
}

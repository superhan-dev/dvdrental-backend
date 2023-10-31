package com.superhan.dvdrentalspringbootbackend.customer.model;

import com.superhan.dvdrentalspringbootbackend.customer.dto.CustomerDto;
import com.superhan.dvdrentalspringbootbackend.customer.repository.entity.Customer;

public class CustomerMapper {
  public static CustomerDto.Detail customerToDto(Customer customer) {
    return CustomerDto.Detail.builder()
        .id(customer.getId())
        .fistName(customer.getFirstName())
        .lastName(customer.getLastName())
        .active(customer.getActive())
        .createDate(customer.getCreateDate())
        .updateDate(customer.getLastUpdate())
        .store(customer.getStore())
        .address(customer.getAddress())
        .build();
  }

}

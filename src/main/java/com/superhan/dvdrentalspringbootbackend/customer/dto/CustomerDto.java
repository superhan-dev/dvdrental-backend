package com.superhan.dvdrentalspringbootbackend.customer.dto;

import java.time.LocalDate;

import com.superhan.dvdrentalspringbootbackend.address.repository.entity.Address;
import com.superhan.dvdrentalspringbootbackend.store.repository.entity.Store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class CustomerDto {
  @Setter
  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Detail {
    private Integer id;
    private String fistName;
    private String lastName;
    private String email;
    private Boolean active;
    private LocalDate createDate;
    private LocalDate updateDate;
    private Store store;
    private Address address;
  }

}

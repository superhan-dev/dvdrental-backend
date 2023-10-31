package com.superhan.dvdrentalspringbootbackend.rental.dto;

import com.superhan.dvdrentalspringbootbackend.customer.repository.entity.Customer;
import com.superhan.dvdrentalspringbootbackend.inventory.repository.entity.Inventory;
import com.superhan.dvdrentalspringbootbackend.staff.repository.entity.Staff;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
public class RentalDto {

    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Detail {
        private Integer id;
        private LocalDate rentalDate;
        private LocalDate returnDate;
        private Customer customer;
        private Inventory inventory;
        private Staff staff;
    }
}

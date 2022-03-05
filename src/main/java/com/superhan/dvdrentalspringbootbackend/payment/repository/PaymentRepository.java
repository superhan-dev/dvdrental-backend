package com.superhan.dvdrentalspringbootbackend.payment.repository;

import com.superhan.dvdrentalspringbootbackend.payment.repository.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
package com.superhan.dvdrentalspringbootbackend.customer.repository.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.BatchSize;

import com.superhan.dvdrentalspringbootbackend.address.repository.entity.Address;
import com.superhan.dvdrentalspringbootbackend.store.repository.entity.Store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "customer_id", nullable = false)
  private Integer id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "email")
  private String email;

  @Column(name = "create_date")
  private LocalDate createDate;

  @Column(name = "last_update")
  private LocalDate lastUpdate;

  @Column(name = "active")
  private Boolean active;

  @ManyToOne(targetEntity = Address.class, fetch = FetchType.LAZY)
  @JoinColumn(name = "address_id")
  private Address address;

  @ManyToOne(targetEntity = Store.class, fetch = FetchType.LAZY)
  @JoinColumn(name = "store_id")
  private Store store;

}

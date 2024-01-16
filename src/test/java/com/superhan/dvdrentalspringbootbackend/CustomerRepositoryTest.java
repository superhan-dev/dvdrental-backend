package com.superhan.dvdrentalspringbootbackend;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;

import com.superhan.dvdrentalspringbootbackend.customer.repository.CustomerRepository;
import com.superhan.dvdrentalspringbootbackend.customer.repository.entity.Customer;

@SpringBootTest
@ActiveProfiles("dev")
@Transactional
public class CustomerRepositoryTest {

  @Autowired
  private EntityManager em;

  @Autowired
  private CustomerRepository customerRepository;

  @Test
  @DisplayName("N + 1 테스트")
  void test() {
    em.flush();
    em.clear();

    PageRequest pageRequest = PageRequest.of(1, 10);
    Page<Customer> customerList = customerRepository.findAll(pageRequest);

    customerList.forEach(it -> System.out.println("Customer 이름:" + it.getFirstName() + " " + it.getLastName()));

  }
}

package com.superhan.dvdrentalspringbootbackend.store.repository;

import com.superhan.dvdrentalspringbootbackend.store.repository.entity.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Integer> {
    @EntityGraph(attributePaths = {"address","staff"})
    Page<Store> findAll(Pageable pageable);
}
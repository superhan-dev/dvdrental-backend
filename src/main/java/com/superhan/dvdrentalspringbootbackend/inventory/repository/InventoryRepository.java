package com.superhan.dvdrentalspringbootbackend.inventory.repository;

import com.superhan.dvdrentalspringbootbackend.inventory.repository.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}
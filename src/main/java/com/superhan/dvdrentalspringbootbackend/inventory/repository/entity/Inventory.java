package com.superhan.dvdrentalspringbootbackend.inventory.repository.entity;

import com.superhan.dvdrentalspringbootbackend.film.repository.Film;
import com.superhan.dvdrentalspringbootbackend.store.repository.entity.Store;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inventory_id", nullable = false)
    private Integer id;

    @ManyToOne(targetEntity = Store.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @ManyToOne(targetEntity = Film.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id")
    private Film film;
}
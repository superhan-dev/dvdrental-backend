package com.superhan.dvdrentalspringbootbackend.film.repository;

import com.superhan.dvdrentalspringbootbackend.inventory.repository.entity.Inventory;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "film_id", nullable = false)
    private Long id;

    private String title;
    private String description;
    private Integer releaseYear;
    private Integer languageId;
    private Integer rentalDuration;

    @Column(name = "rental_rate")
    @ColumnDefault("4.99")
    private Double rentalRate;

    private Integer length;

    @Column(name = "replacement_cost")
    @ColumnDefault("19.990000000000002")
    private Double replacementCost;

    @Column(name = "special_features")
    private String specialFeatures;

}
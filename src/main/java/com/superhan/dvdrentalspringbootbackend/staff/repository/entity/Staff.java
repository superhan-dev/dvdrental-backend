package com.superhan.dvdrentalspringbootbackend.staff.repository.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "staff_id", nullable = false)
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;
    private Boolean active;
    private String username;

}
package com.spring.cars.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String brand;
    @Column
    private String model;
    @Column
    private String color;
    @Column
    private int kilometers;
    @Column
    private LocalDate manufacturingDate;
    @Column
    private String image;
}

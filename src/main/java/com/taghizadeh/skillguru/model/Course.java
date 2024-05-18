package com.taghizadeh.skillguru.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    private Long id;

    private String name;

    private String description;

    private LocalTime duration;

    private int chapters;

    private Long amountsPurchased;

    private double rating;

    @ManyToOne
    private Instructor instructor;

    @ManyToOne
    private Category category;
}

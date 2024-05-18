package com.taghizadeh.skillguru.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Instructor extends Users {

    @Column(name = "image_data", columnDefinition = "bytea")
    private byte[] imageData;

    private double rating;

    @OneToMany(mappedBy = "instructor")
    @ToString.Exclude
    private List<Course> courses = new ArrayList<>();

}

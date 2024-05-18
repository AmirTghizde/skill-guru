package com.taghizadeh.skillguru.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Category {

    @Id
    private Long id;

    private String name;

    private String description;

    @ToString.Exclude
    @OneToMany(mappedBy = "category")
    private List<Course> courses = new ArrayList<>();

}

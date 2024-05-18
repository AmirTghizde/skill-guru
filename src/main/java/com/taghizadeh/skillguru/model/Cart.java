package com.taghizadeh.skillguru.model;

import com.taghizadeh.skillguru.model.enums.CourseStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    @Id
    private Long id;

    @OneToOne
    private Student student;

    @Enumerated(EnumType.STRING)
    private CourseStatus status;

    @ManyToMany
    @ToString.Exclude
    private List<Course> courses;

}

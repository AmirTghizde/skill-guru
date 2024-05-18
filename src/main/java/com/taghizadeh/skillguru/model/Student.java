package com.taghizadeh.skillguru.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Users{

    @OneToOne
    private Cart cart;

}

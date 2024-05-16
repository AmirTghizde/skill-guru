package com.taghizadeh.skillguru.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private LocalDateTime originated;

    private LocalDateTime modified;


}

package com.taghizadeh.skillguru.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Wallet {

    @Id
    private Long id;

    private double balance;

    private LocalDateTime originated;

    @OneToOne
    private Users user;
}

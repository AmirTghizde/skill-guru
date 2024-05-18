package com.taghizadeh.skillguru.model;

import com.taghizadeh.skillguru.model.enums.AdminStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends Users{

    @Enumerated(EnumType.STRING)
    private AdminStatus status;

}

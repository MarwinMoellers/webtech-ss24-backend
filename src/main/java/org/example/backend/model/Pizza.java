package org.example.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pizza {
    @Id @GeneratedValue
    Long id;
    String name;
    Double price;
}

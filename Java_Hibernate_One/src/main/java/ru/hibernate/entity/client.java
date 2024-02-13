package ru.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// генерацмия ID через Autoincrement в MySQL
    private int idClient;
    private long Name;
    private long SureName;
}

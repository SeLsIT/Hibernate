package ru.hibernate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Getter
@Setter
public class visits implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)// генерацмия ID через Autoincrement в MySQL
    private int idVisits;
    private Date Date;
    private int idClient;
}

package com.example.station_ski.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Inscription")
public class Inscription implements Serializable {  // convertir la forme l'objet en  byte pour la protection du data //
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idInscription")
    private Integer idInscription; // Clé primaire
    private Long numInscription;
    private Integer numSemaine;
    @ManyToOne
    Skieur skieur;
    @ManyToOne
    Cours cours;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}

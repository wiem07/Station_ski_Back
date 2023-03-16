package com.example.station_ski.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
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

    public Inscription() {
    }

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

package com.example.station_ski.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Moniteur")
public class Moniteur implements Serializable {  // convertir la forme l'objet en  byte pour la protection du data //
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idMoniteur")
    private Integer idMoniteur; // Clé primaire
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date daterecru;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

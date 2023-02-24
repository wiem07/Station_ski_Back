package com.example.station_ski.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Cours")
public class Cours implements Serializable {  // convertir la forme l'objet en  byte pour la protection du data //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCours")
    private Integer idCours; // Clé primaire
    private Long numCours;
    private Integer niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private Integer creneau;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="cours")
    private Set<Inscription> inscription;
}

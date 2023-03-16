package com.example.station_ski.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Getter
@Setter
@Entity
@Table( name = "Skieur")
public class Skieur implements Serializable {  // convertir la forme l'objet en  byte pour la protection du data //
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idSkieur")
    private Integer idSkieur; // Clé primaire
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
    @ManyToMany(mappedBy="skieurs", cascade = CascadeType.ALL)
    private Set<Piste> pistes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="skieur")
    private Set<Inscription> inscriptions;
    @OneToOne(cascade = CascadeType.ALL)
    private Abonnement abonnement;

    public Skieur(Integer idSkieur) {
        this.idSkieur = idSkieur;
    }

    public Skieur() {
    }
    // Constructeur et accesseurs (getters) et mutateurs (setters)
}

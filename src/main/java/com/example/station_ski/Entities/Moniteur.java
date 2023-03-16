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

    public Integer getIdMoniteur() {
        return idMoniteur;
    }

    public Long getNumMoniteur() {
        return numMoniteur;
    }

    public String getNomM() {
        return nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public Date getDaterecru() {
        return daterecru;
    }

    public Set<Cours> getCours() {
        return cours;
    }

    public void setIdMoniteur(Integer idMoniteur) {
        this.idMoniteur = idMoniteur;
    }

    public void setNumMoniteur(Long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public void setDaterecru(Date daterecru) {
        this.daterecru = daterecru;
    }

    public void setCours(Set<Cours> cours) {
        this.cours = cours;
    }
    // Constructeur et accesseurs (getters) et mutateurs (setters)
}

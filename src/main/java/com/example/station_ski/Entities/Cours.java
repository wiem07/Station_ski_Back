package com.example.station_ski.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table( name = "Cours")
public class Cours implements Serializable {  // convertir la forme l'objet en  byte pour la protection du data //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCours")
    private Long idCours; // Clé primaire
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

    public Cours() {

    }

    public Long getIdCours() {
        return idCours;
    }

    public void setIdCours(Long idCours) {
        this.idCours = idCours;
    }

    public Long getNumCours() {
        return numCours;
    }

    public void setNumCours(Long numCours) {
        this.numCours = numCours;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

    public TypeCours getTypeCours() {
        return typeCours;
    }

    public void setTypeCours(TypeCours typeCours) {
        this.typeCours = typeCours;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Integer getCreneau() {
        return creneau;
    }

    public void setCreneau(Integer creneau) {
        this.creneau = creneau;
    }

    public Set<Inscription> getInscription() {
        return inscription;
    }

    public void setInscription(Set<Inscription> inscription) {
        this.inscription = inscription;
    }
}

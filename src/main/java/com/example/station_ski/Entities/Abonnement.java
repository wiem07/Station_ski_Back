package com.example.station_ski.Entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@Table( name = "Abonnement")
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAbonnement")
    private Integer idAbonnement;
    private Long numAbon;
    private Date dateDebut;
    private Date dateFin;
    private Float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;

    public Abonnement() {
    }
}

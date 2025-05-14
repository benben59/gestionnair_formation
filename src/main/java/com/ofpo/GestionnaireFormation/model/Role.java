package com.ofpo.GestionnaireFormation.model;

import jakarta.persistence.*;
// import java.util.Set;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;

    @ManyToMany(mappedBy = "role")
    private List<Utilisateur> utilisateur = new ArrayList<>();


    public Role() {

    }

    public Role(Long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
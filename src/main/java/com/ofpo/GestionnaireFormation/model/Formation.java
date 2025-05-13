package com.ofpo.GestionnaireFormation.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "formation")
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private int numero_offre;
    private Date date_debut;
    private Date date_fin;
    private Date date_debut_pe;
    private Date date_fin_pe;
    private Boolean statut;
    

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

    public int getNumero_offre() {
        return numero_offre;
    }

    public void setNumero_offre(int numero_offre) {
        this.numero_offre = numero_offre;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Date getDate_debut_pe() {
        return date_debut_pe;
    }

    public void setDate_debut_pe(Date date_debut_pe) {
        this.date_debut_pe = date_debut_pe;
    }

    public Date getDate_fin_pe() {
        return date_fin_pe;
    }

    public void setDate_fin_pe(Date date_fin_pe) {
        this.date_fin_pe = date_fin_pe;
    }

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }
}
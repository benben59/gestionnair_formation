package com.ofpo.GestionnaireFormation.DTO;

import java.util.Date;
import java.util.List;

public class FormationDTO {
    private String libelle;
    private int numero_offre;
    private Date date_debut;
    private Date date_fin;
    private Date date_debut_pe;
    private Date date_fin_pe;

    public FormationDTO(
            String libelle,
            int numero_offre,
            Date date_debut,
            Date date_fin,
            Date date_debut_pe,
            Date date_fin_pe) {
        this.libelle = libelle;
        this.numero_offre = numero_offre;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.date_debut_pe = date_debut_pe;
        this.date_fin_pe = date_fin_pe;
    }

    public FormationDTO(){

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

    
}

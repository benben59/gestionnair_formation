package com.ofpo.GestionnaireFormation.DTO;

public class SequenceDTO {
    private String libelle;

    public SequenceDTO(String libelle){
        this.libelle = libelle;
    }

    public SequenceDTO(){

    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

package com.ofpo.GestionnaireFormation.DTO;

public class ModuleDTO {
    private String libelle;

    public ModuleDTO(String libelle){
        this.libelle = libelle;
    }

    public ModuleDTO(){

    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

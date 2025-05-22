package com.ofpo.GestionnaireFormation.DTO;

public class RoleDTO {
    private String libelle;

    public RoleDTO(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

package com.ofpo.GestionnaireFormation.DTO;

/**
 * Data Transfer Object (DTO) pour l'entité Module.
 * Sert à transporter les données d'un module entre les couches de l'application
 * sans exposer l'entité complète.
 */
public class ModuleDTO {
    /**
     * Libellé du module.
     */
    private String libelle;

    /**
     * Constructeur avec paramètres.
     *
     * @param libelle le libellé du module
     */
    public ModuleDTO(String libelle){
        this.libelle = libelle;
    }

    /**
     * Constructeur par défaut.
     */
    public ModuleDTO(){
    }

    /**
     * Retourne le libellé du module.
     *
     * @return le libellé
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Définit le libellé du module.
     *
     * @param libelle le libellé à définir
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

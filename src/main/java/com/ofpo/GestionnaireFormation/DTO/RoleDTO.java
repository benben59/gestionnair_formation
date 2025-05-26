package com.ofpo.GestionnaireFormation.DTO;

/**
 * Data Transfer Object (DTO) pour l'entité Role.
 * Sert à transporter les données d'un rôle entre les couches de l'application
 * sans exposer l'entité complète.
 */
public class RoleDTO {
    /**
     * Libellé du rôle.
     */
    private String libelle;

    /**
     * Constructeur avec paramètre.
     *
     * @param libelle le libellé du rôle
     */
    public RoleDTO(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Retourne le libellé du rôle.
     *
     * @return le libellé
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Définit le libellé du rôle.
     *
     * @param libelle le libellé à définir
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

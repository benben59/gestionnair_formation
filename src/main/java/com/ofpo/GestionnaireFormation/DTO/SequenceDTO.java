package com.ofpo.GestionnaireFormation.DTO;

/**
 * Data Transfer Object (DTO) pour l'entité Sequence.
 * Sert à transporter les données d'une séquence entre les couches de l'application
 * sans exposer l'entité complète.
 */
public class SequenceDTO {
    /**
     * Libellé de la séquence.
     */
    private String libelle;

    /**
     * Constructeur avec paramètre.
     *
     * @param libelle le libellé de la séquence
     */
    public SequenceDTO(String libelle){
        this.libelle = libelle;
    }

    /**
     * Constructeur par défaut.
     */
    public SequenceDTO(){
    }

    /**
     * Retourne le libellé de la séquence.
     *
     * @return le libellé
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Définit le libellé de la séquence.
     *
     * @param libelle le libellé à définir
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

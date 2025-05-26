package com.ofpo.GestionnaireFormation.model;

import jakarta.persistence.*;

/**
 * Entité JPA représentant un module de formation.
 * Cette classe mappe la table "module" en base de données et contient
 * les informations principales d'un module.
 */
@Entity
@Table(name = "module")
public class Module {
    /**
     * Identifiant unique du module (clé primaire).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Libellé du module.
     */
    private String libelle;

    /**
     * Retourne l'identifiant du module.
     *
     * @return l'identifiant du module
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant du module.
     *
     * @param id l'identifiant à définir
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retourne le libellé du module.
     *
     * @return le libellé du module
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

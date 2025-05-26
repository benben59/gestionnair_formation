package com.ofpo.GestionnaireFormation.model;

import jakarta.persistence.*;

/**
 * Entité JPA représentant une séquence de formation.
 * Cette classe mappe la table "sequence" en base de données et contient
 * les informations principales d'une séquence.
 */
@Entity
@Table(name = "sequence")
public class Sequence {
    /**
     * Identifiant unique de la séquence (clé primaire).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Libellé de la séquence.
     */
    private String libelle;

    /**
     * Retourne l'identifiant de la séquence.
     *
     * @return l'identifiant de la séquence
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant de la séquence.
     *
     * @param id l'identifiant à définir
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retourne le libellé de la séquence.
     *
     * @return le libellé de la séquence
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

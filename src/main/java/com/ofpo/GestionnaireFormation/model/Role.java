package com.ofpo.GestionnaireFormation.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Entité JPA représentant un rôle utilisateur.
 * Cette classe mappe la table "role" en base de données et contient
 * les informations principales d'un rôle.
 */
@Entity
@Table(name = "role")
public class Role {
    /**
     * Identifiant unique du rôle (clé primaire).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Libellé du rôle.
     */
    private String libelle;

    /**
     * Liste des utilisateurs associés à ce rôle (relation ManyToMany).
     */
    @ManyToMany(mappedBy = "role")
    private List<Utilisateur> utilisateur = new ArrayList<>();

    /**
     * Constructeur par défaut.
     */
    public Role() {
    }

    /**
     * Constructeur avec paramètres.
     *
     * @param id      l'identifiant du rôle
     * @param libelle le libellé du rôle
     */
    public Role(Long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    /**
     * Retourne l'identifiant du rôle.
     *
     * @return l'identifiant du rôle
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant du rôle.
     *
     * @param id l'identifiant à définir
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retourne le libellé du rôle.
     *
     * @return le libellé du rôle
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

package com.ofpo.GestionnaireFormation.model;

import jakarta.persistence.*;
import java.util.Date;

/**
 * Entité JPA représentant une formation.
 * Cette classe mappe la table "formation" en base de données et contient
 * les informations principales d'une formation.
 */
@Entity
@Table(name = "formation")
public class Formation {
    /**
     * Identifiant unique de la formation (clé primaire).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Libellé de la formation.
     */
    private String libelle;

    /**
     * Numéro d'offre associé à la formation.
     */
    private int numero_offre;

    /**
     * Date de début de la formation.
     */
    private Date date_debut;

    /**
     * Date de fin de la formation.
     */
    private Date date_fin;

    /**
     * Date de début de la période en entreprise.
     */
    private Date date_debut_pe;

    /**
     * Date de fin de la période en entreprise.
     */
    private Date date_fin_pe;

    /**
     * Statut de la formation (active/inactive).
     */
    private Boolean statut;

    /**
     * Retourne l'identifiant de la formation.
     *
     * @return l'identifiant
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant de la formation.
     *
     * @param id l'identifiant à définir
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retourne le libellé de la formation.
     *
     * @return le libellé
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Définit le libellé de la formation.
     *
     * @param libelle le libellé à définir
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Retourne le numéro d'offre.
     *
     * @return le numéro d'offre
     */
    public int getNumero_offre() {
        return numero_offre;
    }

    /**
     * Définit le numéro d'offre.
     *
     * @param numero_offre le numéro d'offre à définir
     */
    public void setNumero_offre(int numero_offre) {
        this.numero_offre = numero_offre;
    }

    /**
     * Retourne la date de début de la formation.
     *
     * @return la date de début
     */
    public Date getDate_debut() {
        return date_debut;
    }

    /**
     * Définit la date de début de la formation.
     *
     * @param date_debut la date de début à définir
     */
    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    /**
     * Retourne la date de fin de la formation.
     *
     * @return la date de fin
     */
    public Date getDate_fin() {
        return date_fin;
    }

    /**
     * Définit la date de fin de la formation.
     *
     * @param date_fin la date de fin à définir
     */
    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    /**
     * Retourne la date de début de la période en entreprise.
     *
     * @return la date de début en entreprise
     */
    public Date getDate_debut_pe() {
        return date_debut_pe;
    }

    /**
     * Définit la date de début de la période en entreprise.
     *
     * @param date_debut_pe la date de début en entreprise à définir
     */
    public void setDate_debut_pe(Date date_debut_pe) {
        this.date_debut_pe = date_debut_pe;
    }

    /**
     * Retourne la date de fin de la période en entreprise.
     *
     * @return la date de fin en entreprise
     */
    public Date getDate_fin_pe() {
        return date_fin_pe;
    }

    /**
     * Définit la date de fin de la période en entreprise.
     *
     * @param date_fin_pe la date de fin en entreprise à définir
     */
    public void setDate_fin_pe(Date date_fin_pe) {
        this.date_fin_pe = date_fin_pe;
    }

    /**
     * Retourne le statut de la formation.
     *
     * @return le statut (true si active, false sinon)
     */
    public Boolean getStatut() {
        return statut;
    }

    /**
     * Définit le statut de la formation.
     *
     * @param statut le statut à définir (true si active, false sinon)
     */
    public void setStatut(Boolean statut) {
        this.statut = statut;
    }
}

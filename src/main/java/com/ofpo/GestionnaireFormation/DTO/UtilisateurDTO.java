package com.ofpo.GestionnaireFormation.DTO;

import java.util.List;

/**
 * Data Transfer Object (DTO) pour l'entité Utilisateur.
 * Sert à transporter les données d'un utilisateur entre les couches de l'application
 * sans exposer l'entité complète.
 */
public class UtilisateurDTO {
    /**
     * Matricule de l'utilisateur.
     */
    private String matricule;

    /**
     * Nom de l'utilisateur.
     */
    private String nom;

    /**
     * Prénom de l'utilisateur.
     */
    private String prenom;

    /**
     * Adresse e-mail de l'utilisateur.
     */
    private String adresseMail;

    /**
     * Liste des rôles de l'utilisateur (au format DTO).
     */
    private List<RoleDTO> role;

    /**
     * Constructeur complet pour UtilisateurDTO.
     *
     * @param matricule    le matricule de l'utilisateur
     * @param nom          le nom de l'utilisateur
     * @param prenom       le prénom de l'utilisateur
     * @param adresseMail  l'adresse e-mail de l'utilisateur
     * @param role         la liste des rôles de l'utilisateur
     */
    public UtilisateurDTO(String matricule, String nom, String prenom, String adresseMail, List<RoleDTO> role) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseMail = adresseMail;
        this.role = role;
    }

    /**
     * Constructeur par défaut.
     */
    public UtilisateurDTO() {
    }

    /**
     * Retourne le matricule de l'utilisateur.
     *
     * @return le matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * Définit le matricule de l'utilisateur.
     *
     * @param matricule le matricule à définir
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * Retourne le nom de l'utilisateur.
     *
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de l'utilisateur.
     *
     * @param nom le nom à définir
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le prénom de l'utilisateur.
     *
     * @return le prénom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit le prénom de l'utilisateur.
     *
     * @param prenom le prénom à définir
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Retourne l'adresse e-mail de l'utilisateur.
     *
     * @return l'adresse e-mail
     */
    public String getAdresseMail() {
        return adresseMail;
    }

    /**
     * Définit l'adresse e-mail de l'utilisateur.
     *
     * @param adresseMail l'adresse e-mail à définir
     */
    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    /**
     * Retourne la liste des rôles de l'utilisateur.
     *
     * @return la liste des rôles
     */
    public List<RoleDTO> getRole() {
        return role;
    }

    /**
     * Définit la liste des rôles de l'utilisateur.
     *
     * @param role la liste des rôles à définir
     */
    public void setRole(List<RoleDTO> role) {
        this.role = role;
    }
}

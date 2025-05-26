package com.ofpo.GestionnaireFormation.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Entité JPA représentant un utilisateur du système.
 * Cette classe mappe la table "utilisateur" en base de données et contient
 * toutes les informations principales relatives à un utilisateur.
 */
@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    /**
     * Identifiant unique de l'utilisateur (clé primaire).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Matricule de l'utilisateur.
     */
    private String matricule;

    /**
     * URL ou chemin de l'avatar de l'utilisateur.
     */
    private String avatar;

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
     * Adresse postale de l'utilisateur.
     */
    private String adressePostal;

    /**
     * Code postal de l'utilisateur.
     */
    private String codePostal;

    /**
     * Ville de l'utilisateur.
     */
    private String ville;

    /**
     * Mot de passe (hashé) de l'utilisateur.
     */
    private String motDePasse;

    /**
     * Statut de l'utilisateur (actif/inactif).
     */
    private Boolean statut;

    /**
     * Liste des rôles attribués à l'utilisateur (relation ManyToMany).
     */
    @ManyToMany
    @JoinTable(
            name = "utilisateur_role", // Nom de la table de jointure
            joinColumns = @JoinColumn(name = "id_utilisateur"), // Clé étrangère vers utilisateur
            inverseJoinColumns = @JoinColumn(name = "id_role") // Clé étrangère vers rôle
    )
    private List<Role> role = new ArrayList<>();

    /**
     * Constructeur par défaut (nécessaire pour Jackson et JPA).
     */
    public Utilisateur () {
    }

    /**
     * Constructeur complet pour l'entité Utilisateur.
     *
     * @param id             l'identifiant de l'utilisateur
     * @param matricule      le matricule de l'utilisateur
     * @param avatar         l'avatar de l'utilisateur
     * @param nom            le nom de l'utilisateur
     * @param prenom         le prénom de l'utilisateur
     * @param adresseMail    l'adresse e-mail de l'utilisateur
     * @param adressePostal  l'adresse postale de l'utilisateur
     * @param codePostal     le code postal de l'utilisateur
     * @param ville          la ville de l'utilisateur
     * @param motDePasse     le mot de passe de l'utilisateur
     * @param statut         le statut de l'utilisateur
     * @param role           la liste des rôles de l'utilisateur
     */
    public Utilisateur(Long id, String matricule, String avatar, String nom, String prenom, String adresseMail,
                       String adressePostal, String codePostal, String ville, String motDePasse, Boolean statut, List<Role> role) {
        this.id = id;
        this.matricule = matricule;
        this.avatar = avatar;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseMail = adresseMail;
        this.adressePostal = adressePostal;
        this.codePostal = codePostal;
        this.ville = ville;
        this.motDePasse = motDePasse;
        this.statut = statut;
        this.role = role;
    }

    // Getters et setters

    /**
     * Retourne l'identifiant de l'utilisateur.
     *
     * @return l'identifiant
     */
    public Long getId(){
        return id;
    }

    /**
     * Définit l'identifiant de l'utilisateur.
     *
     * @param id l'identifiant à définir
     */
    public void setId(Long id) {
        this.id = id;
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
     * Retourne l'avatar de l'utilisateur.
     *
     * @return l'avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Définit l'avatar de l'utilisateur.
     *
     * @param avatar l'avatar à définir
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
     * Retourne l'adresse postale de l'utilisateur.
     *
     * @return l'adresse postale
     */
    public String getAdressePostal() {
        return adressePostal;
    }

    /**
     * Définit l'adresse postale de l'utilisateur.
     *
     * @param adressePostal l'adresse postale à définir
     */
    public void setAdressePostal(String adressePostal) {
        this.adressePostal = adressePostal;
    }

    /**
     * Retourne le code postal de l'utilisateur.
     *
     * @return le code postal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Définit le code postal de l'utilisateur.
     *
     * @param codePostal le code postal à définir
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * Retourne la ville de l'utilisateur.
     *
     * @return la ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la ville de l'utilisateur.
     *
     * @param ville la ville à définir
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * Retourne le mot de passe de l'utilisateur.
     *
     * @return le mot de passe
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * Définit le mot de passe de l'utilisateur.
     *
     * @param motDePasse le mot de passe à définir
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    /**
     * Retourne le statut de l'utilisateur.
     *
     * @return le statut (true si actif, false sinon)
     */
    public Boolean getStatut() {
        return statut;
    }

    /**
     * Définit le statut de l'utilisateur.
     *
     * @param statut le statut à définir (true si actif, false sinon)
     */
    public void setStatut(Boolean statut) {
        this.statut = statut;
    }

    /**
     * Retourne la liste des rôles de l'utilisateur.
     *
     * @return la liste des rôles
     */
    public List<Role> getRole() {
        return role;
    }

    /**
     * Définit la liste des rôles de l'utilisateur.
     *
     * @param role la liste des rôles à définir
     */
    public void setRole(List<Role> role) {
        this.role = role;
    }
}

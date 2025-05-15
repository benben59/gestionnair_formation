package com.ofpo.GestionnaireFormation.model;

import jakarta.persistence.*;
// import java.util.Set;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String avatar;
    private String nom;
    private String prenom;
    private String adresseMail;
    private String adressePostal;
    private String codePostal;
    private String ville;
    private String motDePasse;
    private Boolean statut;

    @ManyToMany
    @JoinTable(name = "utilisateur_role", // Nom de la table de jointure
            joinColumns = @JoinColumn(name = "id_utilisateur"), // Clé étrangère pointant vers l'utilisateur
            inverseJoinColumns = @JoinColumn(name = "id_role") // Clé étrangère pointant vers le rôle
    )
    private List<Role> role = new ArrayList<>(); // Ensemble des rôles attribués à un utilisateur

    //controler vide pour jackson
    public Utilisateur () {
    }

    // constructeur plein 
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



    // getter et setter 
    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getAdressePostal() {
        return adressePostal;
    }

    public void setAdressePostal(String adressePostal) {
        this.adressePostal = adressePostal;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }

    public List<Role> getRole() {
        return role;
    }
    public void setRole(List<Role> role) {
        this.role = role;
    }
}

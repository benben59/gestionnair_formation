package com.ofpo.GestionnaireFormation.DTO;

import com.ofpo.GestionnaireFormation.model.Role;

import java.util.List;

public class UtilisateurDTO {
    private String matricule;
    private String nom;
    private String prenom;
    private String adresseMail;
    private List<RoleDTO> role;

    public UtilisateurDTO(String matricule, String nom, String prenom, String adresseMail, List<RoleDTO> role) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseMail = adresseMail;
        this.role= role;
    }

    public UtilisateurDTO(){

    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public List<RoleDTO> getRole() {
        return role;
    }

    public void setRole(List<RoleDTO> role) {
        this.role = role;
    }
}

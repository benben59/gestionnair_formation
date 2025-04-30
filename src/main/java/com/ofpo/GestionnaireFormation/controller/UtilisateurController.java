package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.model.Utilisateur;
import com.ofpo.GestionnaireFormation.repository.UtilisateurRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @GetMapping("/demo")
    // localhost:8080/utilisateur/demo
    public String demo(){
        return "ghjghj";
    }

    @GetMapping("/")
    public List<Utilisateur> findAll() {
        // retourner la liste complète des utilisateurs
        // j'utilise le repo utilisateur pour faire un findAll et retourner les resultats
        return this.utilisateurRepository.findAll();
    }

    @GetMapping("/{matricule}")
    public Utilisateur findByMatricule(@PathVariable String matricule) {
        // retourner un utilisateur via un numéro de matricule
        return this.utilisateurRepository.findByMatricule(matricule);
    }

    @PostMapping("/ajouter")
    public void add(){
        // ajouter un utilisateur en base de données
    }

    @PutMapping("/modifier")
    public void update(){
        // modifier un utilisateur en base de données
    }

    @DeleteMapping("/supprimer")
    public void delete(){
        // supprime un utilisateur en base de données
    }

    @PutMapping("/supprimer")
    public void updateStatut(){
        // desactive un utilisateur en base de données
    }

}

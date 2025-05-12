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
    public Utilisateur creaUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @PutMapping("/{id}")
    public Utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur updatedUser) {
        return utilisateurRepository.findById(id).map(utilisateur -> {
            utilisateur.setNom(updatedUser.getNom());
            utilisateur.setPrenom(updatedUser.getPrenom());
            utilisateur.setMatricule(updatedUser.getMatricule());
            return utilisateurRepository.save(utilisateur);

        }).orElseThrow(() ->new RuntimeException("utilisateur non trouvé"));
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id){
        utilisateurRepository.deleteById(id);
    }


    @PutMapping("/supprimer")
    public void updateStatut(){
        // desactive un utilisateur en base de données
    }

}

package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.model.Formation;
import com.ofpo.GestionnaireFormation.repository.FormationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formation")
public class FormationController {

    private final FormationRepository formationRepository;

    public FormationController(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    @GetMapping("/demo")
    // localhost:8080/utilisateur/demo
    public String demo(){
        return "ghjghj";
    }

    @GetMapping("/")
    public List<Formation> findAll() {
        // retourner la liste complète des utilisateurs
        // j'utilise le repo utilisateur pour faire un findAll et retourner les resultats
        return this.formationRepository.findAll();
    }

    @GetMapping("/{libelle}")
    public Formation findByLibelle(@PathVariable String libelle) {
        // retourner un utilisateur via un numéro de matricule
        return this.formationRepository.findByLibelle(libelle);
    }

    @PostMapping("/ajouter")
    public Formation creaFormation(@RequestBody Formation formation) {
        return formationRepository.save(formation);
    }

    @PutMapping("/{id}")
    public Formation updateFormation(@PathVariable Long id, @RequestBody Formation updatedUser) {
        return formationRepository.findById(id).map(formation -> {
            formation.setLibelle(updatedUser.getLibelle());
            return formationRepository.save(formation);

        }).orElseThrow(() ->new RuntimeException("formation non trouvé"));
    }

    @DeleteMapping("/{id}")
    public void deleteFormation(@PathVariable Long id){
        formationRepository.deleteById(id);
    }


    @PutMapping("/supprimer")
    public void updateStatut(){
        // desactive un utilisateur en base de données
    }

}
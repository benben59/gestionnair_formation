package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.model.Formation;
import com.ofpo.GestionnaireFormation.repository.FormationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Contrôleur REST pour la gestion des entités Formation.
 * Fournit des endpoints pour créer, lire, mettre à jour et supprimer des formations.
 */
@RestController
@RequestMapping("/formation")
public class FormationController {

    private final FormationRepository formationRepository;

    /**
     * Constructeur du contrôleur FormationController.
     *
     * @param formationRepository le repository de Formation injecté
     */
    public FormationController(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    /**
     * Endpoint de démonstration.
     *
     * @return une chaîne de caractères de test
     */
    @GetMapping("/demo")
    // localhost:8080/formation/demo
    public String demo(){
        return "ghjghj";
    }

    /**
     * Récupère la liste complète des formations.
     *
     * @return une liste de toutes les formations
     */
    @GetMapping("/")
    public List<Formation> findAll() {
        return this.formationRepository.findAll();
    }

    /**
     * Recherche une formation par son libellé.
     *
     * @param libelle le libellé de la formation à rechercher
     * @return la formation correspondante
     */
    @GetMapping("/{libelle}")
    public Formation findByLibelle(@PathVariable String libelle) {
        return this.formationRepository.findByLibelle(libelle);
    }

    /**
     * Crée une nouvelle formation.
     *
     * @param formation l'objet Formation à créer
     * @return la formation créée
     */
    @PostMapping("/ajouter")
    public Formation creaFormation(@RequestBody Formation formation) {
        return formationRepository.save(formation);
    }

    /**
     * Met à jour une formation existante.
     *
     * @param id l'identifiant de la formation à mettre à jour
     * @param updatedUser l'objet Formation contenant les nouvelles informations
     * @return la formation mise à jour
     * @throws RuntimeException si la formation n'est pas trouvée
     */
    @PutMapping("/{id}")
    public Formation updateFormation(@PathVariable Long id, @RequestBody Formation updatedUser) {
        return formationRepository.findById(id).map(formation -> {
            formation.setLibelle(updatedUser.getLibelle());
            return formationRepository.save(formation);
        }).orElseThrow(() ->new RuntimeException("formation non trouvé"));
    }

    /**
     * Supprime une formation par son identifiant.
     *
     * @param id l'identifiant de la formation à supprimer
     */
    @DeleteMapping("/{id}")
    public void deleteFormation(@PathVariable Long id){
        formationRepository.deleteById(id);
    }

    /**
     * Désactive une formation en base de données.
     * (Méthode à implémenter)
     */
    @PutMapping("/supprimer")
    public void updateStatut(){
        // desactive un utilisateur en base de données
    }

}

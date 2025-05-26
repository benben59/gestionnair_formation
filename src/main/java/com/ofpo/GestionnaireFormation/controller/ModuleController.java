package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.model.Module;
import com.ofpo.GestionnaireFormation.repository.ModuleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Contrôleur REST pour la gestion des entités Module.
 * Fournit des endpoints pour créer, lire, mettre à jour et supprimer des modules.
 */
@RestController
@RequestMapping("/module")
public class ModuleController {

    private final ModuleRepository moduleRepository;

    /**
     * Constructeur du contrôleur ModuleController.
     *
     * @param moduleRepository le repository de Module injecté
     */
    public ModuleController(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    /**
     * Endpoint de démonstration.
     *
     * @return une chaîne de caractères de test
     */
    @GetMapping("/demo")
    // localhost:8080/module/demo
    public String demo(){
        return "ghjghj";
    }

    /**
     * Récupère la liste complète des modules.
     *
     * @return une liste de tous les modules
     */
    @GetMapping("/")
    public List<Module> findAll() {
        return this.moduleRepository.findAll();
    }

    /**
     * Recherche un module par son libellé.
     *
     * @param libelle le libellé du module à rechercher
     * @return le module correspondant
     */
    @GetMapping("/{libelle}")
    public Module findByLibelle(@PathVariable String libelle) {
        return this.moduleRepository.findByLibelle(libelle);
    }

    /**
     * Crée un nouveau module.
     *
     * @param module l'objet Module à créer
     * @return le module créé
     */
    @PostMapping("/ajouter")
    public Module creaModule(@RequestBody Module module) {
        return moduleRepository.save(module);
    }

    /**
     * Met à jour un module existant.
     *
     * @param id l'identifiant du module à mettre à jour
     * @param updatedUser l'objet Module contenant les nouvelles informations
     * @return le module mis à jour
     * @throws RuntimeException si le module n'est pas trouvé
     */
    @PutMapping("/{id}")
    public Module updateModule(@PathVariable Long id, @RequestBody Module updatedUser) {
        return moduleRepository.findById(id).map(module -> {
            module.setLibelle(updatedUser.getLibelle());
            return moduleRepository.save(module);

        }).orElseThrow(() ->new RuntimeException("module non trouvé"));
    }

    /**
     * Supprime un module par son identifiant.
     *
     * @param id l'identifiant du module à supprimer
     */
    @DeleteMapping("/{id}")
    public void deleteModule(@PathVariable Long id){
        moduleRepository.deleteById(id);
    }

    /**
     * Désactive un module en base de données.
     * (Méthode à implémenter)
     */
    @PutMapping("/supprimer")
    public void updateStatut(){
        // desactive un module en base de données
    }

}

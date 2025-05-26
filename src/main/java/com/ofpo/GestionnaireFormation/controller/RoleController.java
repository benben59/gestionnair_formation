package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.model.Role;
import com.ofpo.GestionnaireFormation.repository.RoleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Contrôleur REST pour la gestion des rôles.
 * Fournit des endpoints pour créer, lire, mettre à jour et supprimer des rôles.
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleRepository roleRepository;

    /**
     * Constructeur du contrôleur RoleController.
     *
     * @param roleRepository le repository de Role injecté
     */
    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    /**
     * Endpoint de démonstration.
     *
     * @return une chaîne de caractères de test
     */
    @GetMapping("/demo")
    // localhost:8080/role/demo
    public String demo(){
        return "ghjghj";
    }

    /**
     * Récupère la liste complète des rôles.
     *
     * @return une liste de tous les rôles
     */
    @GetMapping("/")
    public List<Role> findAll() {
        return this.roleRepository.findAll();
    }

    /**
     * Recherche un rôle par son libellé.
     *
     * @param libelle le libellé du rôle à rechercher
     * @return le rôle correspondant
     */
    @GetMapping("/{libelle}")
    public Role findByLibelle(@PathVariable String libelle) {
        return this.roleRepository.findByLibelle(libelle);
    }

    /**
     * Crée un nouveau rôle.
     *
     * @param role l'objet Role à créer
     * @return le rôle créé
     */
    @PostMapping("/ajouter")
    public Role creaRole(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    /**
     * Met à jour un rôle existant.
     *
     * @param id l'identifiant du rôle à mettre à jour
     * @param updatedUser l'objet Role contenant les nouvelles informations
     * @return le rôle mis à jour
     * @throws RuntimeException si le rôle n'est pas trouvé
     */
    @PutMapping("/{id}")
    public Role updateRole(@PathVariable Long id, @RequestBody Role updatedUser) {
        return roleRepository.findById(id).map(role -> {
            role.setLibelle(updatedUser.getLibelle());
            return roleRepository.save(role);

        }).orElseThrow(() ->new RuntimeException("role non trouvé"));
    }

    /**
     * Supprime un rôle par son identifiant.
     *
     * @param id l'identifiant du rôle à supprimer
     */
    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id){
        roleRepository.deleteById(id);
    }

    /**
     * Désactive un rôle en base de données.
     * (Méthode à implémenter)
     */
    @PutMapping("/supprimer")
    public void updateStatut(){
        // desactive un rôle en base de données
    }

}

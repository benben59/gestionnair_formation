package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.DTO.RoleDTO;
import com.ofpo.GestionnaireFormation.model.Utilisateur;
import com.ofpo.GestionnaireFormation.repository.UtilisateurRepository;
import org.springframework.web.bind.annotation.*;
import com.ofpo.GestionnaireFormation.DTO.UtilisateurDTO;

import java.util.List;

/**
 * Contrôleur REST pour la gestion des utilisateurs.
 * Fournit des endpoints pour créer, lire, mettre à jour et désactiver des utilisateurs.
 */
@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

    private final UtilisateurRepository utilisateurRepository;

    /**
     * Constructeur du contrôleur UtilisateurController.
     *
     * @param utilisateurRepository le repository d'Utilisateur injecté
     */
    public UtilisateurController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    /**
     * Endpoint de démonstration.
     *
     * @return une chaîne de caractères de test
     */
    @GetMapping("/demo")
    // localhost:8080/utilisateur/demo
    public String demo(){
        return "ghjghj";
    }

    /**
     * Récupère la liste complète des utilisateurs au format DTO.
     * Convertit les entités Utilisateur en DTO contenant :
     * - Les informations basiques de l'utilisateur
     * - La liste des rôles au format DTO
     *
     * @return une liste de {@link UtilisateurDTO}
     */
    @GetMapping("/")
    public List<UtilisateurDTO> findAll() {
        List<Utilisateur> utilisateurs = this.utilisateurRepository.findAll();
        return utilisateurs.stream().map(utilisateur -> {
            UtilisateurDTO dto = new UtilisateurDTO();
            dto.setMatricule(utilisateur.getMatricule());
            dto.setNom(utilisateur.getNom());
            dto.setPrenom(utilisateur.getPrenom());
            dto.setAdresseMail(utilisateur.getAdresseMail());

            List<RoleDTO> roleDtos = utilisateur.getRole().stream()
                    .map(role -> new RoleDTO(role.getLibelle()))
                    .toList();

            dto.setRole(roleDtos);
            return dto;
        }).toList();
    }

    /**
     * Recherche un utilisateur par son matricule.
     *
     * @param matricule le matricule de l'utilisateur à rechercher
     * @return l'utilisateur correspondant
     */
    @GetMapping("/{matricule}")
    public Utilisateur findByMatricule(@PathVariable String matricule) {
        return this.utilisateurRepository.findByMatricule(matricule);
    }

    /**
     * Crée un nouvel utilisateur.
     *
     * @param utilisateur l'objet Utilisateur à créer
     * @return l'utilisateur créé
     */
    @PostMapping("/ajouter")
    public Utilisateur creaUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    /**
     * Met à jour un utilisateur existant.
     *
     * @param id l'identifiant de l'utilisateur à mettre à jour
     * @param updatedUser l'objet Utilisateur contenant les nouvelles informations
     * @return l'utilisateur mis à jour
     * @throws RuntimeException si l'utilisateur n'est pas trouvé
     */
    @PutMapping("/{id}")
    public Utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur updatedUser) {
        return utilisateurRepository.findById(id).map(utilisateur -> {
            utilisateur.setNom(updatedUser.getNom());
            utilisateur.setPrenom(updatedUser.getPrenom());
            utilisateur.setMatricule(updatedUser.getMatricule());
            return utilisateurRepository.save(utilisateur);
        }).orElseThrow(() -> new RuntimeException("utilisateur non trouvé"));
    }

    /**
     * Supprime définitivement un utilisateur par son identifiant.
     *
     * @param id l'identifiant de l'utilisateur à supprimer
     */
    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id){
        utilisateurRepository.deleteById(id);
    }

    /**
     * Désactive un utilisateur en base de données (changement de statut).
     * (Méthode à implémenter - logique de soft delete)
     */
    @PutMapping("/sup-primer")
    public void updateStatut(){
        // logique de désactivation à implémenter
    }
}

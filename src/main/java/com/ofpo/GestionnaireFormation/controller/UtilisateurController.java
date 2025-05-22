package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.DTO.RoleDTO;
import com.ofpo.GestionnaireFormation.model.Utilisateur;
import com.ofpo.GestionnaireFormation.repository.UtilisateurRepository;
import org.springframework.web.bind.annotation.*;
import com.ofpo.GestionnaireFormation.DTO.UtilisateurDTO;

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
    public List<UtilisateurDTO> findAll() {
        // retourner la liste complète des utilisateurs (avec DTO)
        List<Utilisateur> utilisateurs = this.utilisateurRepository.findAll();
        // Utilisation du DTO
        return utilisateurs.stream().map(utilisateur -> {
            //UTILISATEUR
            UtilisateurDTO dto = new UtilisateurDTO();
            dto.setMatricule(utilisateur. getMatricule());
            dto.setNom(utilisateur.getNom());
            dto.setPrenom(utilisateur.getPrenom());
            dto.setAdresseMail(utilisateur.getAdresseMail());
            //ROLES
            List<RoleDTO> roleDtos = utilisateur.getRole().stream()
                    .map(role -> new RoleDTO(role.getLibelle()))
                    .toList();

            dto.setRole(roleDtos);
            return dto;
        }).toList();
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


    @PutMapping("/sup-primer")
    public void updateStatut(){
        // desactive un utilisateur en base de données
    }

}

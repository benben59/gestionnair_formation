package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.model.Role;
import com.ofpo.GestionnaireFormation.repository.RoleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleRepository roleRepository;

    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping("/demo")
    // localhost:8080/utilisateur/demo
    public String demo(){
        return "ghjghj";
    }

    @GetMapping("/")
    public List<Role> findAll() {
        // retourner la liste complète des utilisateurs
        // j'utilise le repo utilisateur pour faire un findAll et retourner les resultats
        return this.roleRepository.findAll();
    }

    @GetMapping("/{libelle}")
    public Role findByLibelle(@PathVariable String libelle) {
        // retourner un utilisateur via un numéro de matricule
        return this.roleRepository.findByLibelle(libelle);
    }

    @PostMapping("/ajouter")
    public Role creaRole(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    @PutMapping("/{id}")
    public Role updateRole(@PathVariable Long id, @RequestBody Role updatedUser) {
        return roleRepository.findById(id).map(role -> {
            role.setLibelle(updatedUser.getLibelle());
            return roleRepository.save(role);

        }).orElseThrow(() ->new RuntimeException("role non trouvé"));
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id){
        roleRepository.deleteById(id);
    }


    @PutMapping("/supprimer")
    public void updateStatut(){
        // desactive un utilisateur en base de données
    }

}
package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.model.Module;
import com.ofpo.GestionnaireFormation.repository.ModuleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/module")
public class ModuleController {

    private final ModuleRepository moduleRepository;

    public ModuleController(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @GetMapping("/demo")
    // localhost:8080/utilisateur/demo
    public String demo(){
        return "ghjghj";
    }

    @GetMapping("/")
    public List<Module> findAll() {
        // retourner la liste complète des utilisateurs
        // j'utilise le repo utilisateur pour faire un findAll et retourner les resultats
        return this.moduleRepository.findAll();
    }

    @GetMapping("/{libelle}")
    public Module findByLibelle(@PathVariable String libelle) {
        // retourner un utilisateur via un numéro de matricule
        return this.moduleRepository.findByLibelle(libelle);
    }

    @PostMapping("/ajouter")
    public Module creaModule(@RequestBody Module module) {
        return moduleRepository.save(module);
    }

    @PutMapping("/{id}")
    public Module updateModule(@PathVariable Long id, @RequestBody Module updatedUser) {
        return moduleRepository.findById(id).map(module -> {
            module.setLibelle(updatedUser.getLibelle());
            return moduleRepository.save(module);

        }).orElseThrow(() ->new RuntimeException("module non trouvé"));
    }

    @DeleteMapping("/{id}")
    public void deleteModule(@PathVariable Long id){
        moduleRepository.deleteById(id);
    }


    @PutMapping("/supprimer")
    public void updateStatut(){
        // desactive un utilisateur en base de données
    }

}
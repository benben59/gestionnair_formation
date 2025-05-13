package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.model.Sequence;
import com.ofpo.GestionnaireFormation.repository.SequenceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sequence")
public class SequenceController {

    private final SequenceRepository sequenceRepository;

    public SequenceController(SequenceRepository sequenceRepository) {
        this.sequenceRepository = sequenceRepository;
    }

    @GetMapping("/demo")
    // localhost:8080/utilisateur/demo
    public String demo(){
        return "ghjghj";
    }

    @GetMapping("/")
    public List<Sequence> findAll() {
        // retourner la liste complète des utilisateurs
        // j'utilise le repo utilisateur pour faire un findAll et retourner les resultats
        return this.sequenceRepository.findAll();
    }

    @GetMapping("/{libelle}")
    public Sequence findByLibelle(@PathVariable String libelle) {
        // retourner un utilisateur via un numéro de matricule
        return this.sequenceRepository.findByLibelle(libelle);
    }

    @PostMapping("/ajouter")
    public Sequence creaSequence(@RequestBody Sequence sequence) {
        return sequenceRepository.save(sequence);
    }

    @PutMapping("/{id}")
    public  Sequence updateSequence(@PathVariable Long id, @RequestBody Sequence updatedUser) {
        return sequenceRepository.findById(id).map(sequence -> {
            sequence.setLibelle(updatedUser.getLibelle());
            return sequenceRepository.save(sequence);

        }).orElseThrow(() ->new RuntimeException("sequen non trouvé"));
    }

    @DeleteMapping("/{id}")
    public void deleteSequence(@PathVariable Long id){
        sequenceRepository.deleteById(id);
    }


    @PutMapping("/supprimer")
    public void updateStatut(){
        // desactive un utilisateur en base de données
    }

}
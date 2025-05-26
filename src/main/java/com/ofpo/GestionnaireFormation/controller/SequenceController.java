package com.ofpo.GestionnaireFormation.controller;

import com.ofpo.GestionnaireFormation.model.Sequence;
import com.ofpo.GestionnaireFormation.repository.SequenceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Contrôleur REST pour la gestion des séquences.
 * Fournit des endpoints pour créer, lire, mettre à jour et supprimer des séquences.
 */
@RestController
@RequestMapping("/sequence")
public class SequenceController {

    private final SequenceRepository sequenceRepository;

    /**
     * Constructeur du contrôleur SequenceController.
     *
     * @param sequenceRepository le repository de Sequence injecté
     */
    public SequenceController(SequenceRepository sequenceRepository) {
        this.sequenceRepository = sequenceRepository;
    }

    /**
     * Endpoint de démonstration.
     *
     * @return une chaîne de caractères de test
     */
    @GetMapping("/demo")
    // localhost:8080/sequence/demo
    public String demo(){
        return "ghjghj";
    }

    /**
     * Récupère la liste complète des séquences.
     *
     * @return une liste de toutes les séquences
     */
    @GetMapping("/")
    public List<Sequence> findAll() {
        return this.sequenceRepository.findAll();
    }

    /**
     * Recherche une séquence par son libellé.
     *
     * @param libelle le libellé de la séquence à rechercher
     * @return la séquence correspondante
     */
    @GetMapping("/{libelle}")
    public Sequence findByLibelle(@PathVariable String libelle) {
        return this.sequenceRepository.findByLibelle(libelle);
    }

    /**
     * Crée une nouvelle séquence.
     *
     * @param sequence l'objet Sequence à créer
     * @return la séquence créée
     */
    @PostMapping("/ajouter")
    public Sequence creaSequence(@RequestBody Sequence sequence) {
        return sequenceRepository.save(sequence);
    }

    /**
     * Met à jour une séquence existante.
     *
     * @param id l'identifiant de la séquence à mettre à jour
     * @param updatedUser l'objet Sequence contenant les nouvelles informations
     * @return la séquence mise à jour
     * @throws RuntimeException si la séquence n'est pas trouvée
     */
    @PutMapping("/{id}")
    public Sequence updateSequence(@PathVariable Long id, @RequestBody Sequence updatedUser) {
        return sequenceRepository.findById(id).map(sequence -> {
            sequence.setLibelle(updatedUser.getLibelle());
            return sequenceRepository.save(sequence);

        }).orElseThrow(() -> new RuntimeException("séquence non trouvée"));
    }

    /**
     * Supprime une séquence par son identifiant.
     *
     * @param id l'identifiant de la séquence à supprimer
     */
    @DeleteMapping("/{id}")
    public void deleteSequence(@PathVariable Long id){
        sequenceRepository.deleteById(id);
    }

    /**
     * Désactive une séquence en base de données.
     * (Méthode à implémenter)
     */
    @PutMapping("/supprimer")
    public void updateStatut(){
        // désactive une séquence en base de données
    }

}

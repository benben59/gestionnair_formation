package com.ofpo.GestionnaireFormation.service;

import com.ofpo.GestionnaireFormation.model.Sequence;
import com.ofpo.GestionnaireFormation.repository.SequenceRepository;

import java.util.List;

public class SequenceService {

    private final SequenceRepository sequenceRepository;

    public SequenceService(SequenceRepository sequenceRepository) {
        this.sequenceRepository = sequenceRepository;
    }

    public List<Sequence> findAll(){
        return this.sequenceRepository.findAll();
    }

    public Sequence findByLibelle(String libelle) {
        return this.sequenceRepository.findByLibelle(libelle);
    }
}

package com.ofpo.GestionnaireFormation.service;

import com.ofpo.GestionnaireFormation.model.Formation;
import com.ofpo.GestionnaireFormation.repository.FormationRepository;

import java.util.List;

public class FormationService {

    private final FormationRepository formationRepository;

    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public List<Formation> findAll(){
        return this.formationRepository.findAll();
    }

    public Formation findByLibelle(String libelle) {
        return this.formationRepository.findByLibelle(libelle);
    }
}

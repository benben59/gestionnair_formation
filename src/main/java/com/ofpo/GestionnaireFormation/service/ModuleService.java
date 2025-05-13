package com.ofpo.GestionnaireFormation.service;

import com.ofpo.GestionnaireFormation.model.Module;
import com.ofpo.GestionnaireFormation.repository.ModuleRepository;

import java.util.List;

public class ModuleService {

    private final ModuleRepository moduleRepository;

    public ModuleService(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    public List<Module> findAll(){
        return this.moduleRepository.findAll();
    }

    public Module findByLibelle(String libelle) {
        return this.moduleRepository.findByLibelle(libelle);
    }
}

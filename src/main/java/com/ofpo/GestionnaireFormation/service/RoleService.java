package com.ofpo.GestionnaireFormation.service;

import com.ofpo.GestionnaireFormation.model.Role;
import com.ofpo.GestionnaireFormation.repository.RoleRepository;

import java.util.List;

public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> findAll(){
        return this.roleRepository.findAll();
    }

    public Role findByLibelle(String libelle) {
        return this.roleRepository.findByLibelle(libelle);
    }
}

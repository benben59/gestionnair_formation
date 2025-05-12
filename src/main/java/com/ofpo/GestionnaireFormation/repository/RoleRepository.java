package com.ofpo.GestionnaireFormation.repository;

import com.ofpo.GestionnaireFormation.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByLibelle(String libelle);
}

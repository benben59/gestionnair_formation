package com.ofpo.GestionnaireFormation.repository;

import com.ofpo.GestionnaireFormation.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository Spring Data JPA pour l'entité {@link Module}.
 * Fournit les opérations CRUD de base ainsi qu'une méthode de recherche personnalisée.
 */
public interface ModuleRepository extends JpaRepository<Module, Long> {
    /**
     * Recherche un module par son libellé.
     *
     * @param libelle le libellé du module à rechercher
     * @return le module correspondant, ou null si aucun n'est trouvé
     */
    Module findByLibelle(String libelle);
}

package com.ofpo.GestionnaireFormation.repository;

import com.ofpo.GestionnaireFormation.model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository Spring Data JPA pour l'entité {@link Formation}.
 * Fournit les opérations CRUD de base ainsi qu'une méthode de recherche personnalisée.
 */
public interface FormationRepository extends JpaRepository<Formation, Long> {
    /**
     * Recherche une formation par son libellé.
     *
     * @param libelle le libellé de la formation à rechercher
     * @return la formation correspondante, ou null si aucune n'est trouvée
     */
    Formation findByLibelle(String libelle);
}

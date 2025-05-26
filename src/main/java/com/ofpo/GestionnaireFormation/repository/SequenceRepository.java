package com.ofpo.GestionnaireFormation.repository;

import com.ofpo.GestionnaireFormation.model.Sequence;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository Spring Data JPA pour l'entité {@link Sequence}.
 * Fournit les opérations CRUD de base ainsi qu'une méthode de recherche personnalisée.
 */
public interface SequenceRepository extends JpaRepository<Sequence, Long> {
    /**
     * Recherche une séquence par son libellé.
     *
     * @param libelle le libellé de la séquence à rechercher
     * @return la séquence correspondante, ou null si aucune n'est trouvée
     */
    Sequence findByLibelle(String libelle);
}

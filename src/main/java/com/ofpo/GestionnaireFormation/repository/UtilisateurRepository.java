package com.ofpo.GestionnaireFormation.repository;

import com.ofpo.GestionnaireFormation.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository Spring Data JPA pour l'entité {@link Utilisateur}.
 * Fournit les opérations CRUD de base ainsi qu'une méthode de recherche personnalisée.
 */
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    /**
     * Recherche un utilisateur par son matricule.
     *
     * @param matricule le matricule de l'utilisateur à rechercher
     * @return l'utilisateur correspondant, ou null si aucun n'est trouvé
     */
    Utilisateur findByMatricule(String matricule);
}

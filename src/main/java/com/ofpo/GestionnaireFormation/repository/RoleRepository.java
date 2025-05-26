package com.ofpo.GestionnaireFormation.repository;

import com.ofpo.GestionnaireFormation.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository Spring Data JPA pour l'entité {@link Role}.
 * Fournit les opérations CRUD de base ainsi qu'une méthode de recherche personnalisée.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    /**
     * Recherche un rôle par son libellé.
     *
     * @param libelle le libellé du rôle à rechercher
     * @return le rôle correspondant, ou null si aucun n'est trouvé
     */
    Role findByLibelle(String libelle);
}

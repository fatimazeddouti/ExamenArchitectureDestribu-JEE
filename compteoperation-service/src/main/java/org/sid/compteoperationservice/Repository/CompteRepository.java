package org.sid.compteoperationservice.Repository;

import org.sid.compteoperationservice.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {
    public Collection<Compte> findByComptecode(Long code);
}

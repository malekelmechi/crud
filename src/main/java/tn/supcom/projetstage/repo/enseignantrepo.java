package tn.supcom.projetstage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.supcom.projetstage.model.enseignant;

@Repository
public interface enseignantrepo extends JpaRepository<enseignant, Long> {
}

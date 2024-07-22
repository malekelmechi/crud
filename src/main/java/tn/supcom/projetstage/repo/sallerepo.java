package tn.supcom.projetstage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.supcom.projetstage.model.salle;

@Repository
public interface sallerepo  extends JpaRepository<salle,Long> {
}

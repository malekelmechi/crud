package tn.supcom.projetstage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.supcom.projetstage.model.activite;


@Repository
public interface activiterepo extends JpaRepository<activite, Long> {
}

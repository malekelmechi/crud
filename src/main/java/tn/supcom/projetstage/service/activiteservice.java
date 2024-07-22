package tn.supcom.projetstage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.supcom.projetstage.model.activite;
import tn.supcom.projetstage.repo.activiterepo;

import java.util.List;

@Service
public class activiteservice {

    @Autowired
    private activiterepo A1;

    public List<activite> getAllActivites() {
        return A1.findAll();
    }

    public activite getActiviteById(Long id) {
        return A1.findById(id).orElse(null);
    }

    public activite saveActivite(activite activite) {
         return A1.save(activite);
    }

    public void deleteActiviteById(Long id) {
        A1.deleteById(id);
    }
}

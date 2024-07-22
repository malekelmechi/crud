package tn.supcom.projetstage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.supcom.projetstage.model.enseignant;
import tn.supcom.projetstage.repo.enseignantrepo;
import java.util.List;

@Service
public class enseignantservice {
    @Autowired
    enseignantrepo E1;
    public List<enseignant> getAllEnseignants() {
        return E1.findAll();
    }

    public enseignant getEnseignantById(Long id) {
        return E1.findById(id).orElse(null);
    }

    public enseignant saveEnseignant(enseignant enseignant) {
         return E1.save(enseignant);
    }

    public void deleteEnseignantById(Long id) {
        E1.deleteById(id);
    }
}
package tn.supcom.projetstage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.supcom.projetstage.model.matiere;
import tn.supcom.projetstage.repo.matiererepo;

import java.util.List;
@Service
public class matiereservice {

    @Autowired
    private matiererepo M1;

    public List<matiere> getAllMatiere() {
        return M1.findAll();
    }
    public matiere getMatiereById(long id) {
        return M1.findById(id).orElse(null);
    }
    public matiere saveMatiere(matiere matiere) {
           return  M1.save(matiere);
    }
    public void deleteMatiereById(Long id) {
        M1.deleteById(id);
    }
}

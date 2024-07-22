package tn.supcom.projetstage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.supcom.projetstage.model.salle;
import tn.supcom.projetstage.repo.sallerepo;

import java.util.List;

@Service
public class salleservice {

    @Autowired
    sallerepo S1;

    public List<salle> getAllSalles() {
        return S1.findAll();
    }

    public salle getSalleById(Long id) {
        return S1.findById(id).orElse(null);
    }

    public salle  saveSalle(salle salle) {
        return S1.save(salle);
    }

    public void  deleteSalleById(Long id) {
          S1.deleteById(id);
    }
}

package tn.supcom.projetstage.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.supcom.projetstage.model.enseignant;
import tn.supcom.projetstage.service.enseignantservice;

import java.util.List;

@RestController
@RequestMapping("/enseignants")
public class enseignantcont {

    @Autowired
    private enseignantservice enseignantService;

    @GetMapping
    public List<enseignant> getAllEnseignants() {
        return enseignantService.getAllEnseignants();
    }

    @GetMapping("/{id}")
    public enseignant getEnseignantById(@PathVariable Long id) {
        return enseignantService.getEnseignantById(id);
    }

    @PostMapping("/saveEnseignant")
    public enseignant saveEnseignant(@RequestBody enseignant enseignant) {
        return enseignantService.saveEnseignant(enseignant);
    }

    @DeleteMapping("/{id}")

    public void deleteEnseignantById(@PathVariable Long id) {
        enseignantService.deleteEnseignantById(id);
    }
}

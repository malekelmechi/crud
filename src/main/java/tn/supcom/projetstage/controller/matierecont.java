package tn.supcom.projetstage.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.supcom.projetstage.model.matiere;
import tn.supcom.projetstage.service.matiereservice;

import java.util.List;

@RestController
@RequestMapping("/matieres")
public class matierecont {

    @Autowired
    private matiereservice matiereService;

    @GetMapping
    public List<matiere> getAllMatiere() {
        return matiereService.getAllMatiere();
    }

    @GetMapping("/{id}")
    public matiere getMatiereById(@PathVariable Long id) {
        return matiereService.getMatiereById(id);
    }

    @PostMapping("/saveMatiere")
    public matiere saveMatiere(@RequestBody matiere matiere) {
        return matiereService.saveMatiere(matiere);
    }

    @DeleteMapping("/{id}")

    public void deleteMatiereById(@PathVariable Long id) {
        matiereService.deleteMatiereById(id);
    }
}

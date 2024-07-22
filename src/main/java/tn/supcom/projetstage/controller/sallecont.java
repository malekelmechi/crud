package tn.supcom.projetstage.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.supcom.projetstage.model.salle;
import tn.supcom.projetstage.service.salleservice;
import java.util.List;

@RestController

public class sallecont {
    @Autowired
    salleservice salleService;

    @GetMapping
        public List<salle> getAllSalles() {
          return salleService.getAllSalles();
        }
    @GetMapping("/{id}")
    public salle getSalleById(@PathVariable Long id) {
     return salleService.getSalleById(id);
    }

    @PostMapping("/saveSalle")
    public salle saveSalle(@RequestBody salle salle) {
        return salleService.saveSalle(salle);
    }

    @DeleteMapping("/{id}")

    public void deleteSalleById(@PathVariable Long id) {
        salleService.deleteSalleById(id);

}
}


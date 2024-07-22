package tn.supcom.projetstage.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.supcom.projetstage.model.activite;
import tn.supcom.projetstage.service.activiteservice;

import java.util.List;

@RestController
@RequestMapping("/activites")
public class activitecont {

    @Autowired
    private activiteservice activiteService;

    @GetMapping
    public List<activite> getAllActivites() {
        return activiteService.getAllActivites();
    }

    @GetMapping("/{id}")
    public activite getActiviteById(@PathVariable Long id) {
        return activiteService.getActiviteById(id);
    }

    @PostMapping("/saveActivite")
    public activite saveActivite(@RequestBody activite activite) {
        return activiteService.saveActivite(activite);
    }

    @DeleteMapping("/{id}")

    public void deleteActiviteById(@PathVariable Long id) {
        activiteService.deleteActiviteById(id);
    }
}

package com.esprit.rendezVous.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.rendezVous.model.RendezVous;
import com.esprit.rendezVous.service.IRendezVousService;



@RestController
@RequestMapping(value = "/api/GestionRendezVous")

public class RendezVousController {
	
	@Autowired
	IRendezVousService service ;
	
	@PostMapping
    public RendezVous ajouterRendezVous(@RequestBody RendezVous rendezVous) {
        return service.ajouterRendezVous(rendezVous);
    }

	@GetMapping("/getOne/{id}")
    public RendezVous getOne(@PathVariable("id") Long id) {
        return service.getRendezVous(id);
    }

 

    @GetMapping("/getAll")
    public List<RendezVous> getAll() {
        return service.getAllRendezVous();
    }
	
}

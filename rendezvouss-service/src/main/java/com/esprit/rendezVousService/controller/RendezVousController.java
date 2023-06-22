package com.esprit.rendezVousService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.rendezVousService.model.RendezVous;
import com.esprit.rendezVousService.service.IRendezVousService;



@RestController
@RequestMapping(value = "API/GestionRendezVous")

public class RendezVousController {
	@Autowired
	IRendezVousService service ;

	@GetMapping("/getOne/{id}")
    public RendezVous getOne(@PathVariable("id") Long id) {
        return service.getRendezVous(id);
    }

 

    @GetMapping("/getAll")
    public List<RendezVous> getAll() {
        return service.getAllRendezVous();
    }
	
}

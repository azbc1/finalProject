package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Compte;
import com.example.demo.service.ICompteService;

@RestController
@RequestMapping(value = "api/GestionCompte")
public class CompteController {

	@Autowired
	ICompteService service;

	@GetMapping("/getOne/{id}")
	public Compte getOne(@PathVariable("id") Long id) {
		return service.getCompte(id);
	}

	@GetMapping("/getAll")
	public List<Compte> getAll() {
		return service.getAllCompte();
	}

}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Compte;
import com.example.demo.repository.ICompteRepository;

@Service
public class CompteSerice implements ICompteService {
	
	@Autowired
	ICompteRepository repo;

	@Override
	public List<Compte> getAllCompte() {
		return (List<Compte>) repo.findAll();
	}

	@Override
	public Compte getCompte(Long id) {
		return repo.findById(id).orElse(null);
	}

}

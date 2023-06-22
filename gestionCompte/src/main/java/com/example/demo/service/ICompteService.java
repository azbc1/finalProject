package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Compte;

public interface ICompteService {
	
	public List<Compte> getAllCompte();
	public Compte getCompte(Long id);
	

}

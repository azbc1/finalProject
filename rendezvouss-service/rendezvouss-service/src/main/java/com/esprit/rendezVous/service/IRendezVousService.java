package com.esprit.rendezVous.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esprit.rendezVous.model.RendezVous;

@Service
public interface IRendezVousService {
	
	public List<RendezVous> getAllRendezVous();
    public RendezVous getRendezVous(Long id);
	public RendezVous ajouterRendezVous(RendezVous conge);

}

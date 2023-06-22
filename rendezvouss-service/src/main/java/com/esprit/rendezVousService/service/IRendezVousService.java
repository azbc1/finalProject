package com.esprit.rendezVousService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esprit.rendezVousService.model.RendezVous;

@Service
public interface IRendezVousService {
	
	public List<RendezVous> getAllRendezVous();
    public RendezVous getRendezVous(Long id);

}

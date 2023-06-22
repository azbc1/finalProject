package com.esprit.rendezVousService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.esprit.rendezVousService.model.RendezVous;
import com.esprit.rendezVousService.repository.RendezVousRepository;

/**
 * User Service
 * 
 * @author maissaBenRomdhane
 *
 */

public class RendezVousService implements IRendezVousService {

	@Autowired
	RendezVousRepository rp;

	@Override
	public List<RendezVous> getAllRendezVous() {
		return (List<RendezVous>) rp.findAll();
	}

	@Override
	public RendezVous getRendezVous(Long id) {
		return rp.findById(id).get();
	}

}

package com.esprit.rendezVous.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.rendezVous.model.RendezVous;
import com.esprit.rendezVous.repository.RendezVousRepository;

/**
 * User Service
 * 
 * @author maissaBenRomdhane
 *
 */

@Service
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

	@Override
	public RendezVous ajouterRendezVous(RendezVous rendezVous) {
		 return rp.save(rendezVous);
	}

}

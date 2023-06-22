package com.esprit.rendezVousService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.rendezVousService.model.RendezVous;




@Repository
public interface  RendezVousRepository extends CrudRepository<RendezVous, Long> {
 

}

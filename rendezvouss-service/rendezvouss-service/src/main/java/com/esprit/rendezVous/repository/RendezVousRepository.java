package com.esprit.rendezVous.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.rendezVous.model.RendezVous;




@Repository
public interface  RendezVousRepository extends CrudRepository<RendezVous, Long> {
 

}

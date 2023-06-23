package com.esprit.credit.repository;


import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.esprit.credit.entity.Insurance;


public interface InsuranceRepository extends CrudRepository<Insurance, Long> {

	
}

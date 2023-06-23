package com.esprit.credit.repository;

import org.springframework.data.repository.CrudRepository;

import com.esprit.credit.entity.Credit;

public interface CreditRepository extends CrudRepository<Credit, Long> {


}
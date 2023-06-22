package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Compte;

public interface ICompteRepository extends CrudRepository<Compte, Long>{

}

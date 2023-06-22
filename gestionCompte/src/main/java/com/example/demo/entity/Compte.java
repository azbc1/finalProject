package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Compte implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long numeroCompte;
	private String rib;
	private Double solde;
	private String currency;
	private String type;
//	@JsonIgnoreProperties("compteId")
//	private List<BankCarte> bankCartes;
//	@JsonIgnoreProperties("compteId")
//	private List<Income> incomes;
	// @JsonIgnoreProperties("compteList")
//	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//	@JsonIdentityReference(alwaysAsId = true)
//	@ManyToOne(cascade = CascadeType.PERSIST)
//	private Client client;
	private boolean isActive;
	private double negativeCeiling;
	private double acountFees = 0d;

}

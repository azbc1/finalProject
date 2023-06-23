package com.esprit.rendezVous.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.esprit.rendezVous.enums.AppointmentStatus;
import com.esprit.rendezVous.enums.AppoitementType;



/**
 * RendezVous Model
 * 
 * @author MaissaBenRomdhane
 *
 */
@Table(name = "data_Appoitement")
@Entity
public class RendezVous {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;

	@Column(name = "start")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate start;

	@Column(name = "endDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "canceled_at", nullable = true)
	private LocalDate canceledAt;

	@Enumerated(EnumType.STRING)
	private AppoitementType types;
	
	private String description;

	@Column(columnDefinition = "varchar(32) default 'SCHEDULED'")
	@Enumerated(EnumType.STRING)
	private AppointmentStatus state;
	
	
	
	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public RendezVous(Date date, LocalDate start, LocalDate endDate, LocalDate canceledAt, AppoitementType types,
			String description, AppointmentStatus state) {
		super();
		this.date = date;
		this.start = start;
		this.endDate = endDate;
		this.canceledAt = canceledAt;
		this.types = types;
		this.description = description;
		this.state = state;
	}



	public RendezVous(Long id, Date date, AppoitementType types, String description) {
		this.id = id;
		this.date = date;
		types = types;
		this.description = description;
	}


	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getEnd() {
		return endDate;
	}

	public void setEnd(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getCanceledAt() {
		return canceledAt;
	}

	public void setCanceledAt(LocalDate canceledAt) {
		this.canceledAt = canceledAt;
	}

	public AppointmentStatus getState() {
		return state;
	}

	public void setState(AppointmentStatus state) {
		this.state = state;
	}

	public AppoitementType getTypes() {
		return types;
	}

	public void setTypes(AppoitementType types) {
		types = types;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int compareTo(RendezVous o) {
		return this.getStart().compareTo(o.getStart());

	}
}

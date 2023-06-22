package com.esprit.rendezVousService.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.esprit.enums.AppointmentStatus;
import com.esprit.enums.AppoitementType;

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
	private Long id;
	private Date date;

	@Column(name = "start")
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDateTime start;

	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	@Column(name = "end")
	private LocalDateTime end;

	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	@Column(name = "canceled_at", nullable = true)
	private LocalDateTime canceledAt;

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public LocalDateTime getCanceledAt() {
		return canceledAt;
	}

	public void setCanceledAt(LocalDateTime canceledAt) {
		this.canceledAt = canceledAt;
	}

	public AppointmentStatus getState() {
		return state;
	}

	public void setState(AppointmentStatus state) {
		this.state = state;
	}

	@Enumerated(EnumType.STRING)
	private AppoitementType Types;
	private String description;

	@Column(columnDefinition = "varchar(32) default 'SCHEDULED'")
	@Enumerated(EnumType.STRING)
	private AppointmentStatus state;

	public RendezVous(Long id, Date date, AppoitementType types, String description) {
		this.id = id;
		this.date = date;
		Types = types;
		this.description = description;
	}

	public AppoitementType getTypes() {
		return Types;
	}

	public void setTypes(AppoitementType types) {
		Types = types;
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

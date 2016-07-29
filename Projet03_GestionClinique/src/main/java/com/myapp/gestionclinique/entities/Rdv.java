package com.myapp.gestionclinique.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Rdv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRdv;
	@Temporal(TemporalType.DATE)
	private Date dateRdv;
	private String motif;
	
	@ManyToOne
	@JoinColumn(name="ID_MEDECIN")
	private Medecin medecin;
	@ManyToOne
	@JoinColumn(name="ID_PATIENT")
	private Patient patient;
	
	
	public Rdv() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rdv(Date dateRdv, String motif) {
		super();
		this.dateRdv = dateRdv;
		this.motif = motif;
	}

	public Long getIdRdv() {
		return idRdv;
	}
	public void setIdRdv(Long idRdv) {
		this.idRdv = idRdv;
	}
	public Date getDateRdv() {
		return dateRdv;
	}
	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	

}

package com.myapp.gestionclinique.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Prescription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPrescription;
	private String medicament;
	private String frequence;
	private Double prix;
	private String duree;
	
	@OneToMany
	@JoinColumn(name="ID_PRESCRIPTION")
	private List<Consultation> tabConsultation;

	
	
	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Prescription(String medicament, String frequence, Double prix, String duree) {
		super();
		this.medicament = medicament;
		this.frequence = frequence;
		this.prix = prix;
		this.duree = duree;
	}


	public Long getIdPrescription() {
		return idPrescription;
	}

	public void setIdPrescription(Long idPrescription) {
		this.idPrescription = idPrescription;
	}

	public String getMedicament() {
		return medicament;
	}

	public void setMedicament(String medicament) {
		this.medicament = medicament;
	}

	public String getFrequence() {
		return frequence;
	}

	public void setFrequence(String frequence) {
		this.frequence = frequence;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}
	
	@JsonIgnore
	public List<Consultation> getTabConsultation() {
		return tabConsultation;
	}

	public void setTabConsultation(List<Consultation> tabConsultation) {
		this.tabConsultation = tabConsultation;
	}
	
	

}

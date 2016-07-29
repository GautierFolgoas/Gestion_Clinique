package com.myapp.gestionclinique.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Consultation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long idConsultation;
	protected Double prix;
	protected String synthese;
	
	@OneToOne
	@JoinColumn(name="ID_RDV")
	protected Rdv rdv;
	
	public Consultation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Consultation(Double prix, String synthese) {
		super();
		this.prix = prix;
		this.synthese = synthese;
	}


	public Long getIdConsultation() {
		return idConsultation;
	}
	public void setIdConsultation(Long idConsultation) {
		this.idConsultation = idConsultation;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getSynthese() {
		return synthese;
	}
	public void setSynthese(String synthese) {
		this.synthese = synthese;
	}

	@JsonIgnore
	public Rdv getRdv() {
		return rdv;
	}

	@JsonSetter
	public void setRdv(Rdv rdv) {
		this.rdv = rdv;
	}
	
	

}

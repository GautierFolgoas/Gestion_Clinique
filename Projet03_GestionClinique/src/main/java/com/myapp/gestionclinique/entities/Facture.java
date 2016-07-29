package com.myapp.gestionclinique.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Facture {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFacture;
	private Double tva;
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	
	@OneToOne
	@JoinColumn(name="ID_CONSULTATION")
	private Consultation consultation;
	
	//CONSTRUCTEUR
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Facture(Double tva, Date dateFacture) {
		super();
		this.tva = tva;
		this.dateFacture = dateFacture;
	}


	//GETTER & SETTER
	
	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public Double getTva() {
		return tva;
	}

	public void setTva(Double tva) {
		this.tva = tva;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	
	@JsonIgnore
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	
	

}

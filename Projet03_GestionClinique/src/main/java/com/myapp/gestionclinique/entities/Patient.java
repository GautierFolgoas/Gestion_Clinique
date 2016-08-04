package com.myapp.gestionclinique.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPatient;
	@NotEmpty(message="Veuillez indiquer un nom.")
	private String nomPatient;
	@NotEmpty(message="Veuillez indiquer un prénom.")
	private String prenomPatient;
	@NotNull(message="Veuillez indiquer une date.")
	@Temporal(TemporalType.DATE)
	private Date dateDeNaissance;
	@NotEmpty(message="Veuillez indiquer un sexe.")
	private String sexe;
	@NotEmpty(message="Veuillez indiquer une adresse.")
	private String adresse;
	@NotEmpty(message="Veuillez indiquer un numéro de téléphone.")
	private String telPatient;
	
	/*
	@OneToMany(mappedBy="patient", fetch=FetchType.EAGER)
	private List<Rdv> tabRdvPatient;
	*/
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Patient(String nomPatient, String prenomPatient, Date dateDeNaissance, String sexe, String adresse,
			String telPatient) {
		super();
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.dateDeNaissance = dateDeNaissance;
		this.sexe = sexe;
		this.adresse = adresse;
		this.telPatient = telPatient;
	}



	public Long getIdPatient() {
		return idPatient;
	}


	public void setIdPatient(Long idPatient) {
		this.idPatient = idPatient;
	}

	public String getNomPatient() {
		return nomPatient;
	}

	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}

	public String getPrenomPatient() {
		return prenomPatient;
	}

	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelPatient() {
		return telPatient;
	}

	public void setTelPatient(String telPatient) {
		this.telPatient = telPatient;
	}	

}

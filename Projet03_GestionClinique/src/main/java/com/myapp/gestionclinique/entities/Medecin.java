package com.myapp.gestionclinique.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medecin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMedecin;
	private String nomMedecin;
	private String prenomMedecin;
	private String telMedecin;
	private String specialite;
	
	/*
	@OneToMany(mappedBy="medecin", fetch=FetchType.EAGER)
	private List<Rdv> tabRdvMedecin;
	*/
	
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Medecin(String nomMedecin, String prenomMedecin, String telMedecin, String specialite) {
		super();
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.telMedecin = telMedecin;
		this.specialite = specialite;
	}


	public Long getIdMedecin() {
		return idMedecin;
	}

	public void setIdMedecin(Long idMedecin) {
		this.idMedecin = idMedecin;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	public String getPrenomMedecin() {
		return prenomMedecin;
	}

	public void setPrenomMedecin(String prenomMedecin) {
		this.prenomMedecin = prenomMedecin;
	}

	public String getTelMedecin() {
		return telMedecin;
	}

	public void setTelMedecin(String telMedecin) {
		this.telMedecin = telMedecin;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}	
	

}

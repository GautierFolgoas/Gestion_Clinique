package com.myapp.gestionclinique.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@DiscriminatorColumn(name="TYPE_TRAITEMENT", discriminatorType=DiscriminatorType.STRING)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Traitement extends Consultation {
	
	private String etat;

	public Traitement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Traitement(Double prix, String synthese, String etat) {
		super(prix, synthese);
		// TODO Auto-generated constructor stub
		this.etat = etat;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	

}

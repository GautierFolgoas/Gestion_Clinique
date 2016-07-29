package com.myapp.gestionclinique.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EXAMEN_BIOLOGIE")
public class ExamenBiologie extends Traitement {
	
	private String typeExamenBio;
	
	public ExamenBiologie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExamenBiologie(Double prix, String synthese, String etat, String typeExamenBio) {
		super(prix, synthese, etat);
		// TODO Auto-generated constructor stub
		this.typeExamenBio=typeExamenBio;
	}

	public String getTypeExamenBio() {
		return typeExamenBio;
	}

	public void setTypeExamenBio(String typeExamenBio) {
		this.typeExamenBio = typeExamenBio;
	}
	
	
}

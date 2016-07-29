package com.myapp.gestionclinique.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EXAMEN_RADIO")
public class ExamenRadio extends Traitement {

	public ExamenRadio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExamenRadio(Double prix, String synthese, String etat) {
		super(prix, synthese, etat);
		// TODO Auto-generated constructor stub
	}
	
	

}

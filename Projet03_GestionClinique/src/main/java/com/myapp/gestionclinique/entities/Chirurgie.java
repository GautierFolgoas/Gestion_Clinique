package com.myapp.gestionclinique.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CHIRURGIE")
public class Chirurgie extends Traitement {

	public Chirurgie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chirurgie(Double prix, String synthese, String etat) {
		super(prix, synthese, etat);
		// TODO Auto-generated constructor stub
	}
	
	

}

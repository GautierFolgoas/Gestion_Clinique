package com.myapp.gestionclinique.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CONSULTATION_SIMPLE")
public class ConsultationSimple extends Consultation {

	public ConsultationSimple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultationSimple(Double prix, String synthese) {
		super(prix, synthese);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

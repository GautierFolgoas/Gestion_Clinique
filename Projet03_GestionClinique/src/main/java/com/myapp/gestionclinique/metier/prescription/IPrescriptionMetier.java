package com.myapp.gestionclinique.metier.prescription;

import java.util.List;

import com.myapp.gestionclinique.entities.Prescription;

public interface IPrescriptionMetier {
	
	public Prescription addPrescription(Prescription p, Long idConsultation);
	public List<Prescription> getListPrescription();
}

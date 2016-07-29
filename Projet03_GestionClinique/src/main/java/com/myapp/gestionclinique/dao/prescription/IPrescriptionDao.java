package com.myapp.gestionclinique.dao.prescription;

import java.util.List;

import com.myapp.gestionclinique.entities.Prescription;

public interface IPrescriptionDao {
	
	public Prescription addPrescription(Prescription p, Long idConsultation);
	public List<Prescription> getListPrescription();
}

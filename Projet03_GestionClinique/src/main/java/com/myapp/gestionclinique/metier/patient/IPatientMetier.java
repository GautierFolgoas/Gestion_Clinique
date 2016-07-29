package com.myapp.gestionclinique.metier.patient;

import java.util.List;

import com.myapp.gestionclinique.entities.Patient;

public interface IPatientMetier {
	
	public Patient addPatient(Patient p);
	public List<Patient> getListPatient();

}

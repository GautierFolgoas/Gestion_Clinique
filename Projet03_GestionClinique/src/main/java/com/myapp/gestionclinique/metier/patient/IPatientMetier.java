package com.myapp.gestionclinique.metier.patient;

import java.util.List;

import com.myapp.gestionclinique.entities.Patient;
import com.myapp.gestionclinique.exception.ObjetNullException;

public interface IPatientMetier {
	
	public Patient addPatient(Patient p) throws ObjetNullException;
	public List<Patient> getListPatient();

}

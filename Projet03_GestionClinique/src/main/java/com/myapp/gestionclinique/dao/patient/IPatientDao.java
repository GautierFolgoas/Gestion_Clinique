package com.myapp.gestionclinique.dao.patient;

import java.util.List;

import com.myapp.gestionclinique.entities.Patient;

public interface IPatientDao {
	
	public Patient addPatient(Patient p);
	public List<Patient> getListPatient();

}

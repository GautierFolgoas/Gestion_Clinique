package com.myapp.gestionclinique.metier.patient;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.myapp.gestionclinique.dao.patient.IPatientDao;
import com.myapp.gestionclinique.entities.Patient;
import com.myapp.gestionclinique.exception.ObjetNullException;

@Transactional
public class ImplementPatientMetier implements IPatientMetier {
	
	Logger log = Logger.getLogger("ImplementPatientMetier");
	
	private IPatientDao dao;
	
	
	public void setDao(IPatientDao dao) {
		this.dao = dao;
		log.info("------------DAO PATIENT INJECTED--------------");
	}

	@Override
	public Patient addPatient(Patient p) throws ObjetNullException {
		// TODO Auto-generated method stub
		return dao.addPatient(p);
	}

	@Override
	public List<Patient> getListPatient() {
		// TODO Auto-generated method stub
		return dao.getListPatient();
	}

}

package com.myapp.gestionclinique;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.gestionclinique.entities.Patient;
import com.myapp.gestionclinique.exception.ObjetNullException;
import com.myapp.gestionclinique.metier.patient.IPatientMetier;

@RestController
public class RestPatient {
	
	@Autowired
	private IPatientMetier patientMetier;
	
	@RequestMapping(value="/addPatient", method=RequestMethod.POST)
	public Patient addPatient(@RequestBody Patient p) throws ObjetNullException{
		return patientMetier.addPatient(p);
	}
	
	@RequestMapping(value="/getListPatient", method=RequestMethod.GET)
	public List<Patient> getListPatient(){
		return patientMetier.getListPatient();
	}

}

package com.myapp.gestionclinique;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
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
	public Object addPatient(@RequestBody @Valid Patient p, BindingResult r){
		if(r.hasErrors()){
			HashMap<String, Object> errors = new HashMap<String, Object>();
			errors.put("errors", true);
			for(FieldError f: r.getFieldErrors()){
				errors.put(f.getField(), f.getDefaultMessage());
			}
			return errors;
			
		}
		return patientMetier.addPatient(p);
	}
	
	@RequestMapping(value="/getListPatient", method=RequestMethod.GET)
	public List<Patient> getListPatient(){
		return patientMetier.getListPatient();
	}

}

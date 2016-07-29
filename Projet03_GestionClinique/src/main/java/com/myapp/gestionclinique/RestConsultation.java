package com.myapp.gestionclinique;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.gestionclinique.entities.Consultation;
import com.myapp.gestionclinique.exception.ObjetInexistantException;
import com.myapp.gestionclinique.metier.consultation.IConsultationMetier;

@RestController
public class RestConsultation {
	
	@Autowired
	private IConsultationMetier consultationMetier;
	
	@RequestMapping(value="/addConsultation/{idRdv}", method=RequestMethod.POST)
	public Consultation addConsultation(@RequestBody Consultation c, @PathVariable("idRdv") Long idRdv) throws ObjetInexistantException{
		return consultationMetier.addConsultation(c, idRdv);
	}
	
	@RequestMapping(value="/getListConsultation", method=RequestMethod.GET)
	public List<Consultation> getListConsultation(){
		return consultationMetier.getListConsultation();
	}
	
	@RequestMapping(value="/getListConsultationByPatient/{idPatient}", method=RequestMethod.GET)
	public List<Consultation> getListConsultationByPatient(@PathVariable("idPatient") Long idPatient) throws ObjetInexistantException{
		return consultationMetier.getListConsultationByPatient(idPatient);
	}

}

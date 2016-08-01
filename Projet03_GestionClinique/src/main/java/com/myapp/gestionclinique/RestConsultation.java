package com.myapp.gestionclinique;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.gestionclinique.entities.Chirurgie;
import com.myapp.gestionclinique.entities.Consultation;
import com.myapp.gestionclinique.entities.ConsultationSimple;
import com.myapp.gestionclinique.entities.ExamenBiologie;
import com.myapp.gestionclinique.entities.ExamenRadio;
import com.myapp.gestionclinique.exception.ObjetInexistantException;
import com.myapp.gestionclinique.metier.consultation.IConsultationMetier;

@RestController
public class RestConsultation {
	
	@Autowired
	private IConsultationMetier consultationMetier;
	
	@RequestMapping(value="/addConsultationSimple/{idRdv}", method=RequestMethod.POST)
	public Consultation addConsultationSimple(@RequestBody ConsultationSimple c, @PathVariable("idRdv") Long idRdv) throws ObjetInexistantException{
		return consultationMetier.addConsultation(c, idRdv);
	}
	@RequestMapping(value="/addChirurgie/{idRdv}", method=RequestMethod.POST)
	public Consultation addChirurgie(@RequestBody Chirurgie c, @PathVariable("idRdv") Long idRdv) throws ObjetInexistantException{
		return consultationMetier.addConsultation(c, idRdv);
	}
	@RequestMapping(value="/addExamenRadio/{idRdv}", method=RequestMethod.POST)
	public Consultation addExamenRadio(@RequestBody ExamenRadio c, @PathVariable("idRdv") Long idRdv) throws ObjetInexistantException{
		return consultationMetier.addConsultation(c, idRdv);
	}
	@RequestMapping(value="/addExamenBiologie/{idRdv}", method=RequestMethod.POST)
	public Consultation addExamenBiologie(@RequestBody ExamenBiologie c, @PathVariable("idRdv") Long idRdv) throws ObjetInexistantException{
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

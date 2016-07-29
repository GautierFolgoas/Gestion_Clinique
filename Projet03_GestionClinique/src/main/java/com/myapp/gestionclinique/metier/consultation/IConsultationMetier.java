package com.myapp.gestionclinique.metier.consultation;

import java.util.List;

import com.myapp.gestionclinique.entities.Consultation;
import com.myapp.gestionclinique.exception.ObjetInexistantException;

public interface IConsultationMetier {
	
	public Consultation addConsultation(Consultation c, Long idRdv) throws ObjetInexistantException;
	public List<Consultation> getListConsultation();
	public List<Consultation> getListConsultationByPatient(Long idPatient) throws ObjetInexistantException;

}

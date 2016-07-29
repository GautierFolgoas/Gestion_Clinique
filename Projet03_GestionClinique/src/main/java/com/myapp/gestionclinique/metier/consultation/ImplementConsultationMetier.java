package com.myapp.gestionclinique.metier.consultation;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.myapp.gestionclinique.dao.consultation.IConsultationDao;
import com.myapp.gestionclinique.entities.Consultation;
import com.myapp.gestionclinique.exception.ObjetInexistantException;

@Transactional
public class ImplementConsultationMetier implements IConsultationMetier {
	
	Logger log = Logger.getLogger("ImplementConsultationMetier");
	
	private IConsultationDao dao;
	
	public void setDao(IConsultationDao dao) {
		this.dao = dao;
		log.info("------------DAO CONSULTATION INJECTED--------------");
	}

	

	@Override
	public List<Consultation> getListConsultation() {
		// TODO Auto-generated method stub
		return dao.getListConsultation();
	}

	@Override
	public List<Consultation> getListConsultationByPatient(Long idPatient) throws ObjetInexistantException {
		// TODO Auto-generated method stub
		return dao.getListConsultationByPatient(idPatient);
	}



	@Override
	public Consultation addConsultation(Consultation c, Long idRdv) throws ObjetInexistantException {
		// TODO Auto-generated method stub
		return dao.addConsultation(c, idRdv);
	}

}

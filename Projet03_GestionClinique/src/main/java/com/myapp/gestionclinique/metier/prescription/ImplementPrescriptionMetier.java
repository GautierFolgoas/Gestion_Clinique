package com.myapp.gestionclinique.metier.prescription;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.myapp.gestionclinique.dao.prescription.IPrescriptionDao;
import com.myapp.gestionclinique.entities.Prescription;

@Transactional
public class ImplementPrescriptionMetier implements IPrescriptionMetier {
	
	Logger log = Logger.getLogger("ImplementPrescriptionMetier");
	
	private IPrescriptionDao dao;
	
	public void setDao(IPrescriptionDao dao) {
		this.dao = dao;
		log.info("------------DAO PRESCRIPTION INJECTED--------------");
	}

	@Override
	public Prescription addPrescription(Prescription p, Long idConsultation) {
		// TODO Auto-generated method stub
		return dao.addPrescription(p,idConsultation);
	}

	@Override
	public List<Prescription> getListPrescription() {
		// TODO Auto-generated method stub
		return dao.getListPrescription();
	}

}

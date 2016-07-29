package com.myapp.gestionclinique.dao.prescription;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.myapp.gestionclinique.entities.Consultation;
import com.myapp.gestionclinique.entities.Prescription;

public class ImplementPrescriptionDao implements IPrescriptionDao {
	
	Logger log = Logger.getLogger("ImplementPrescriptionDao");

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Prescription addPrescription(Prescription p, Long idConsultation) {
		Consultation c = em.find(Consultation.class, idConsultation);
		p.getTabConsultation().add(c);
		em.persist(p);
		log.info("La prescription de durée: "+p.getDuree()+" a bien été ajoutée");
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Prescription> getListPrescription() {
		Query query = em.createQuery("from Prescription p");
		log.info("il existe "+query.getResultList().size()+" prescriptions");
		return query.getResultList();
	}

}

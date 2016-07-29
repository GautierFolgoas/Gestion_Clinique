package com.myapp.gestionclinique.dao.consultation;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.myapp.gestionclinique.entities.Consultation;
import com.myapp.gestionclinique.entities.Patient;
import com.myapp.gestionclinique.entities.Rdv;
import com.myapp.gestionclinique.exception.ObjetInexistantException;

public class ImplementConsultationDao implements IConsultationDao {
	
	Logger log = Logger.getLogger("ImplementConsultationDao");

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Consultation addConsultation(Consultation c, Long idRdv) throws ObjetInexistantException {
	    Rdv r = em.find(Rdv.class, idRdv);
	    if(r == null){
	    	throw new ObjetInexistantException("La rdv indiqué n'existe pas");
	    }
	    c.setRdv(r);
		em.persist(c);
	    log.info("la consultation de type "+c.getClass().getSimpleName()+" a bien été ajouté");
		return c;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Consultation> getListConsultation() {
		Query query = em.createQuery("from Consultation c");
		log.info("il existe "+query.getResultList().size()+" consultations.");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Consultation> getListConsultationByPatient(Long idPatient) throws ObjetInexistantException {
		Patient p = em.find(Patient.class, idPatient);
		if(p == null){
			throw new ObjetInexistantException("Le client indiqué n'existe pas");
		}
		Query query = em.createQuery("from Consultation as c inner join c.rdv as r where r.patient.idPatient = :x");
		query.setParameter("x",idPatient);
		log.info("Le patient "+idPatient+" a eu "+query.getResultList().size()+" consultations.");
		return query.getResultList();
	}

}

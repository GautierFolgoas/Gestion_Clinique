package com.myapp.gestionclinique.dao.patient;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.myapp.gestionclinique.entities.Patient;
import com.myapp.gestionclinique.exception.ObjetInexistantException;
import com.myapp.gestionclinique.exception.ObjetNullException;

public class ImplementPatientDao implements IPatientDao {
	

	Logger log = Logger.getLogger("ImplementPatientDao");

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Patient addPatient(Patient p){
		em.persist(p);
	    log.info("Le patient "+p.getNomPatient()+" a bien été ajouté");
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> getListPatient() {
		Query query = em.createQuery("from Patient p");
		log.info("il existe "+query.getResultList().size()+" patients");
		return query.getResultList();
	}

}

package com.myapp.gestionclinique.dao.rdv;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.myapp.gestionclinique.entities.Medecin;
import com.myapp.gestionclinique.entities.Patient;
import com.myapp.gestionclinique.entities.Rdv;
import com.myapp.gestionclinique.exception.ObjetInexistantException;

public class ImplementRdvDao implements IRdvDao{
	
	Logger log = Logger.getLogger("ImplementRdvDao");

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Rdv addRdv(Rdv r, Long idPatient, Long idMedecin) throws ObjetInexistantException {
		Medecin m = em.find(Medecin.class, idMedecin);
		Patient p = em.find(Patient.class, idPatient);
		if(m == null){
			throw new ObjetInexistantException("La médecin indiqué n'exsite pas");
		} else if (p == null){
			throw new ObjetInexistantException("Le Patient indiqué n'existe pas");
		}
		r.setMedecin(m);
		r.setPatient(p);
		em.persist(r);
	    log.info("Le rdv entre docteur "+r.getMedecin().getNomMedecin()+" et le patient "+r.getPatient().getNomPatient()+" a bien été ajouté");
		return r;
	}

	@Override
	public Rdv deleteRdv(Long idRdv) throws ObjetInexistantException {
		Rdv r = em.find(Rdv.class, idRdv);
		if(r == null){
			throw new ObjetInexistantException("Le rdv indiqué n'existe pas");
		}
		em.remove(r);
		return r;
	}

	@Override
	public Rdv updateRdv(Rdv r) {
		Rdv r2 = em.find(Rdv.class, r.getIdRdv());
		if(r2.getMedecin() != null){
			r.setMedecin(r2.getMedecin());
		}
		if (r2.getPatient() != null){
			r.setPatient(r2.getPatient());
		}
		em.merge(r);
		log.info("Le rdv "+r.getIdRdv()+"a bien été modifié");
		return r;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Rdv> getListRdv() {
		Query query = em.createQuery("from Rdv r");
		log.info("Il existe "+query.getResultList().size()+" rdv dans la database");
		return query.getResultList();
	}

}

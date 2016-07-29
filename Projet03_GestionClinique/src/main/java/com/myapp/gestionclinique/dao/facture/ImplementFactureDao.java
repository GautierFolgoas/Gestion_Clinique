package com.myapp.gestionclinique.dao.facture;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.myapp.gestionclinique.entities.Consultation;
import com.myapp.gestionclinique.entities.Facture;
import com.myapp.gestionclinique.exception.ObjetInexistantException;

public class ImplementFactureDao implements IFactureDao {
	
	Logger log = Logger.getLogger("ImplementFactureDao");

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Facture addFacture(Facture f, Long idConsultation) throws ObjetInexistantException {
		Consultation c = em.find(Consultation.class,idConsultation);
		if(c == null){
			throw new ObjetInexistantException("La consultation indiquée n'existe pas");
		}
		f.setConsultation(c);
		em.persist(f);
	    log.info("la facture "+f.getClass().getSimpleName()+" a bien été ajoutée");
		return f;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Facture> getListFacture() {
		Query query = em.createQuery("from Facture c");
		log.info("il existe "+query.getResultList().size()+" factures");
		return query.getResultList();
	}

}

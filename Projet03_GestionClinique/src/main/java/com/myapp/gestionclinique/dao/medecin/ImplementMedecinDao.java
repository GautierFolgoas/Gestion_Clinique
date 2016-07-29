package com.myapp.gestionclinique.dao.medecin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.myapp.gestionclinique.entities.Medecin;
import com.myapp.gestionclinique.entities.Rdv;

public class ImplementMedecinDao implements IMedecinDao{
	
	Logger log = Logger.getLogger("ImplementMedecinDao");

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Medecin addMedecin(Medecin m) {
		em.persist(m);
	    log.info("Le medecin "+m.getClass().getSimpleName()+" a bien été ajouté");
		return m;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Medecin> disponibiliteMedecin(Date d) {
		Date d2 = new Date();
		Query query1 = em.createQuery("select distinct r.medecin from Rdv r where r.dateRdv<? and r.dateRdv!=?");
		query1.setParameter(1,d2);
		query1.setParameter(2,d);
		Query query2 = em.createQuery("from Medecin as m where m.idMedecin not in (select r.medecin.idMedecin from Rdv as r)");
		List<Medecin> tabMedecin1 = query1.getResultList();
		List<Medecin> tabMedecin2 = query2.getResultList();
		List<Medecin> tabMedecinDispo = new ArrayList<Medecin>();
		for(Medecin m : tabMedecin1){
			tabMedecinDispo.add(m);
		}
		for(Medecin m : tabMedecin2){
			tabMedecinDispo.add(m);
		}
		log.info("il existe "+tabMedecinDispo.size()+" médecins disponibles");
		return tabMedecinDispo;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Medecin> getListMedecin() {
		Query query = em.createQuery("from Medecin m");
		log.info("il existe "+query.getResultList().size()+" médecins");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean disponibiliteMedecinById(Date d, Long idMedecin) {
		Query query = em.createQuery("from Rdv as r where r.medecin.idMedecin = :x");
		query.setParameter("x",idMedecin);
		boolean disponibilite = false;
		if(query.getResultList().size()==0){
			disponibilite = true;
			log.info("La dispo :"+disponibilite);
		}
		List<Rdv> tabRdv = query.getResultList();
		for(Rdv r : tabRdv){
			if(r.getDateRdv().compareTo(new Date())==1 ){
				if(r.getDateRdv().compareTo(d)!=0){
					disponibilite = true;
					log.info("La dispo :"+disponibilite);
				}
			}else if(r.getDateRdv().compareTo(new Date())==-1){
				disponibilite = true;
			}
		}
		return disponibilite;
	}
	
	

}

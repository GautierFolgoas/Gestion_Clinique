package com.myapp.gestionclinique.metier.medecin;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.myapp.gestionclinique.dao.medecin.IMedecinDao;
import com.myapp.gestionclinique.entities.Medecin;

@Transactional
public class ImplementMedecinMetier implements IMedecinMetier {
	
	Logger log = Logger.getLogger("ImplementMedecinMetier");
	
	private IMedecinDao dao;
	
	public void setDao(IMedecinDao dao) {
		this.dao = dao;
		log.info("------------DAO MEDECIN INJECTED--------------");
	}

	@Override
	public Medecin addMedecin(Medecin m) {
		// TODO Auto-generated method stub
		return dao.addMedecin(m);
	}

	@Override
	public List<Medecin> disponibiliteMedecin(Date d) {
		// TODO Auto-generated method stub
		return dao.disponibiliteMedecin(d);
	}

	@Override
	public List<Medecin> getListMedecin() {
		// TODO Auto-generated method stub
		return dao.getListMedecin();
	}

	@Override
	public boolean disponibiliteMedecinById(Date d, Long idMedecin) {
		// TODO Auto-generated method stub
		return dao.disponibiliteMedecinById(d, idMedecin);
	}

}

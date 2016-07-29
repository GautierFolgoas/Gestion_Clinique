package com.myapp.gestionclinique.metier.facture;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.myapp.gestionclinique.dao.facture.IFactureDao;
import com.myapp.gestionclinique.entities.Facture;
import com.myapp.gestionclinique.exception.ObjetInexistantException;

@Transactional
public class ImplementFactureMetier implements IFactureMetier {
	
	Logger log = Logger.getLogger("ImplementFactureMetier");
	
	private IFactureDao dao;
	
	public void setDao(IFactureDao dao) {
		this.dao = dao;
		log.info("------------DAO FACTURE INJECTED--------------");
	}

	@Override
	public Facture addFacture(Facture f, Long idConsultation) throws ObjetInexistantException {
		// TODO Auto-generated method stub
		return dao.addFacture(f, idConsultation);
	}

	@Override
	public List<Facture> getListFacture() {
		// TODO Auto-generated method stub
		return dao.getListFacture();
	}

}

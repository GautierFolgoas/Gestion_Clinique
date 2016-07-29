package com.myapp.gestionclinique.metier.rdv;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.myapp.gestionclinique.dao.rdv.IRdvDao;
import com.myapp.gestionclinique.entities.Rdv;
import com.myapp.gestionclinique.exception.ObjetInexistantException;

@Transactional
public class ImplementRdvMetier implements IRdvMetier {
	
	Logger log = Logger.getLogger("ImplementRdvMetier");
	
	private IRdvDao dao;
	
	public void setDao(IRdvDao dao) {
		this.dao = dao;
		log.info("------------DAO RDV INJECTED--------------");
	}

	@Override
	public Rdv addRdv(Rdv r, Long idPatient, Long idMedecin) throws ObjetInexistantException {
		// TODO Auto-generated method stub
		return dao.addRdv(r, idPatient, idMedecin);
	}

	@Override
	public Rdv deleteRdv(Long idRdv) throws ObjetInexistantException {
		// TODO Auto-generated method stub
		return dao.deleteRdv(idRdv);
	}

	@Override
	public Rdv updateRdv(Rdv r) {
		// TODO Auto-generated method stub
		return dao.updateRdv(r);
	}

	@Override
	public List<Rdv> getListRdv() {
		// TODO Auto-generated method stub
		return dao.getListRdv();
	}

}

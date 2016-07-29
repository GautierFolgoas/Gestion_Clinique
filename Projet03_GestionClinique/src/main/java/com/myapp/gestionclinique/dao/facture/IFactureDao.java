package com.myapp.gestionclinique.dao.facture;

import java.util.List;

import com.myapp.gestionclinique.entities.Facture;
import com.myapp.gestionclinique.exception.ObjetInexistantException;

public interface IFactureDao {
	
	public Facture addFacture(Facture f, Long idConsultation) throws ObjetInexistantException;
	public List<Facture> getListFacture();
}

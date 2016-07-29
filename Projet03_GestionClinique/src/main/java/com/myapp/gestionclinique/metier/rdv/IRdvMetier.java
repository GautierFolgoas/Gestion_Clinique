package com.myapp.gestionclinique.metier.rdv;

import java.util.List;

import com.myapp.gestionclinique.entities.Rdv;
import com.myapp.gestionclinique.exception.ObjetInexistantException;

public interface IRdvMetier {
	
	public Rdv addRdv(Rdv r, Long idPatient, Long idMedecin) throws ObjetInexistantException;
	public Rdv deleteRdv(Long idRdv) throws ObjetInexistantException;
	public Rdv updateRdv(Rdv r);
	public List<Rdv> getListRdv();

}

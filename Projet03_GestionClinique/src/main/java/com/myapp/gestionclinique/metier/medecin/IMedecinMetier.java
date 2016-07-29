package com.myapp.gestionclinique.metier.medecin;

import java.util.Date;
import java.util.List;

import com.myapp.gestionclinique.entities.Medecin;

public interface IMedecinMetier {
	
	public Medecin addMedecin(Medecin m);
	public List<Medecin> disponibiliteMedecin(Date d);
	public boolean disponibiliteMedecinById(Date d, Long idMedecin);
	public List<Medecin> getListMedecin();

}

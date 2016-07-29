package com.myapp.gestionclinique;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.gestionclinique.entities.Medecin;
import com.myapp.gestionclinique.metier.medecin.IMedecinMetier;

@RestController
public class RestMedecin {
	
	@Autowired
	private IMedecinMetier medecinMetier;
	
	@RequestMapping(value="/addMedecin", method=RequestMethod.POST)
	public Medecin addMedecin(@RequestBody Medecin m){
		return medecinMetier.addMedecin(m);
	}
	
	@RequestMapping(value="/disponibiliteMedecin/{date}", method=RequestMethod.GET)
	public List<Medecin> disponibiliteMedecin(@PathVariable("date") Date d){
		return medecinMetier.disponibiliteMedecin(d);
	}
	
	@RequestMapping(value="/disponibiliteMedecinById/{idMedecin}", method=RequestMethod.GET)
	public boolean disponibiliteMedecinById(@PathVariable("date") Date d, @PathVariable("idMedecin") Long idMedecin){
		return medecinMetier.disponibiliteMedecinById(d, idMedecin);
	}
	
	@RequestMapping(value="/getListMedecin", method=RequestMethod.GET)
	public List<Medecin> getListMedecin(){
		return medecinMetier.getListMedecin();
	}
	
}

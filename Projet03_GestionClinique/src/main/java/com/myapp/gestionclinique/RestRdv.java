package com.myapp.gestionclinique;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.gestionclinique.entities.Rdv;
import com.myapp.gestionclinique.exception.ObjetInexistantException;
import com.myapp.gestionclinique.metier.rdv.IRdvMetier;

@RestController
public class RestRdv {
	
	@Autowired
	private IRdvMetier rdvMetier;
	
	@RequestMapping(value="/addRdv/{idPatient}/{idMedecin}", method=RequestMethod.POST)
	public Rdv addRdv(@RequestBody Rdv r, @PathVariable("idPatient") Long idPatient, @PathVariable("idMedecin") Long idMedecin) throws ObjetInexistantException{
		return rdvMetier.addRdv(r, idPatient, idMedecin);
	}
	
	@RequestMapping(value="/deleteRdv/{idRdv}", method=RequestMethod.DELETE)
	public Rdv deleteRdv(@PathVariable("idRdv") Long idRdv) throws ObjetInexistantException{
		return rdvMetier.deleteRdv(idRdv);
	}
	
	@RequestMapping(value="/updateRdv", method=RequestMethod.POST)
	public Rdv updateRdv(@RequestBody Rdv r) throws ObjetInexistantException{
		return rdvMetier.updateRdv(r);
	}
	
	@RequestMapping(value="/getListRdv", method=RequestMethod.GET)
	public List<Rdv> getListRdv(){
		return rdvMetier.getListRdv();
	}

}

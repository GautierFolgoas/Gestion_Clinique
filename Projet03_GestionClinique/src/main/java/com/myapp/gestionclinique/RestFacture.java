package com.myapp.gestionclinique;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.gestionclinique.entities.Facture;
import com.myapp.gestionclinique.exception.ObjetInexistantException;
import com.myapp.gestionclinique.metier.facture.IFactureMetier;

@RestController
public class RestFacture {
	
	@Autowired
	private IFactureMetier factureMetier;
	
	@RequestMapping(value="/addFacture/{idConsultation}", method=RequestMethod.POST)
	public Facture addFacture(@RequestBody Facture f, @PathVariable("idConsultation") Long idConsultation) throws ObjetInexistantException{
		return factureMetier.addFacture(f, idConsultation);
	}
	
	@RequestMapping(value="/getListFacture", method=RequestMethod.GET)
	public List<Facture> getListFacture(){
		return factureMetier.getListFacture();
	}

}

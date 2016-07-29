package com.myapp.gestionclinique;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.gestionclinique.entities.Prescription;
import com.myapp.gestionclinique.metier.prescription.IPrescriptionMetier;

@RestController
public class RestPrescription {
	
	@Autowired
	private IPrescriptionMetier prescriptionMetier;
	
	@RequestMapping(value="/addPrescription/{idConsultation}", method=RequestMethod.POST)
	public Prescription addPrescription(@RequestBody Prescription p, @PathVariable("idConsultation") Long idConsultation){
		return prescriptionMetier.addPrescription(p,idConsultation);
	}
	
	@RequestMapping(value="/getListPrescription", method=RequestMethod.GET)
	public List<Prescription> getListPrescription(){
		return prescriptionMetier.getListPrescription();
	}

}

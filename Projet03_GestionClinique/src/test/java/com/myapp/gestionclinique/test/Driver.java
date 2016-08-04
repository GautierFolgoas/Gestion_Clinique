package com.myapp.gestionclinique.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.gestionclinique.entities.Consultation;
import com.myapp.gestionclinique.entities.ConsultationSimple;
import com.myapp.gestionclinique.entities.Facture;
import com.myapp.gestionclinique.entities.Medecin;
import com.myapp.gestionclinique.entities.Patient;
import com.myapp.gestionclinique.entities.Prescription;
import com.myapp.gestionclinique.entities.Rdv;
import com.myapp.gestionclinique.exception.ObjetInexistantException;
import com.myapp.gestionclinique.metier.consultation.IConsultationMetier;
import com.myapp.gestionclinique.metier.facture.IFactureMetier;
import com.myapp.gestionclinique.metier.medecin.IMedecinMetier;
import com.myapp.gestionclinique.metier.patient.IPatientMetier;
import com.myapp.gestionclinique.metier.prescription.IPrescriptionMetier;
import com.myapp.gestionclinique.metier.rdv.IRdvMetier;

public class Driver {
	
	private static IPatientMetier patientMetier;
	private static IMedecinMetier medecinMetier;
	private static IRdvMetier rdvMetier;
	private static IConsultationMetier consultationMetier;
	private static IFactureMetier factureMetier;
	private static IPrescriptionMetier prescriptionMetier;
	private static ClassPathXmlApplicationContext context;
	
	public static void main(String[] args) throws ParseException {
		
		context = new ClassPathXmlApplicationContext("app.xml");
		patientMetier = (IPatientMetier) context.getBean("patientMetier");
		medecinMetier = (IMedecinMetier) context.getBean("medecinMetier");
		rdvMetier = (IRdvMetier) context.getBean("rdvMetier");
		consultationMetier = (IConsultationMetier) context.getBean("consultationMetier");
		factureMetier = (IFactureMetier) context.getBean("factureMetier");
		prescriptionMetier = (IPrescriptionMetier) context.getBean("prescriptionMetier");
		
		//prescriptionMetier.addPrescription(new Prescription("medicament", "frequence", 23D, "duree"), 1L);
		
		/*
		try {
			rdvMetier.addRdv(new Rdv(new Date(), "motif"), 1L, 1L);
			rdvMetier.addRdv(new Rdv(new Date(), "motif"), 2L, 1L);
			rdvMetier.addRdv(new Rdv(new Date(), "motif"), 3L, 2L);
			rdvMetier.addRdv(new Rdv(new Date(), "motif"), 3L, 3L);
		} catch (ObjetInexistantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sf.parse("2016-08-25");
		List<Medecin> tab = medecinMetier.disponibiliteMedecin(d1);
		for(Medecin m: tab){
			System.out.println(m.getNomMedecin());
		}
		*/
		
		patientMetier.addPatient(new Patient("nomPatient", "prenomPatient", new Date(),"sexe", "adresse", "telPatient"));
		
		/*SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sf.parse("2016-08-21");
		medecinMetier.disponibiliteMedecin(d1);*/
		/*
		patientMetier.addPatient(new Patient("nomPatient2", "prenomPatient2", new Date(), "sexe", "adresse", "telPatient"));
		patientMetier.addPatient(new Patient("nomPatient2", "prenomPatient2", new Date(), "sexe", "adresse", "telPatient"));
		
		medecinMetier.addMedecin(new Medecin("nomMedecin", "prenomMedecin", "telMedecin", "specialite"));
		medecinMetier.addMedecin(new Medecin("nomMedecin2", "prenomMedecin2", "telMedecin2", "specialite2"));
		
		
		try {
			rdvMetier.addRdv(new Rdv(new Date(), "motif"), 1L, 1L);
		} catch (ObjetInexistantException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			consultationMetier.addConsultation(new ConsultationSimple(22D, "synthese"), 1L);
		} catch (ObjetInexistantException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		try {
			consultationMetier.getListConsultationByPatient(1L);
		} catch (ObjetInexistantException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			factureMetier.addFacture(new Facture(23D, new Date()), 2L);
		} catch (ObjetInexistantException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d1 = sf.parse("2016-08-21");
			medecinMetier.disponibiliteMedecin(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean z = medecinMetier.disponibiliteMedecinById(new Date(), 1L);
		System.out.println(z);
		*/
		
		
		
	}

}

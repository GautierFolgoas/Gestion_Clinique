package com.myapp.gestionclinique.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.gestionclinique.entities.Consultation;
import com.myapp.gestionclinique.entities.ConsultationSimple;
import com.myapp.gestionclinique.exception.ObjetInexistantException;
import com.myapp.gestionclinique.metier.consultation.IConsultationMetier;

public class ConsultationTestU {
	
	private static ClassPathXmlApplicationContext context;
	private static IConsultationMetier metier;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metier = (IConsultationMetier) context.getBean("consultationMetier");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testGetListConsultation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListConsultationByPatient() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddConsultation() throws ObjetInexistantException {
		Consultation c = new ConsultationSimple(42D, "synthese");
		metier.addConsultation(c, 2L);
		assertNotNull(c.getIdConsultation());
	}

}

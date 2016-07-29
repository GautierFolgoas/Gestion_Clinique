package com.myapp.gestionclinique.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.gestionclinique.entities.Rdv;
import com.myapp.gestionclinique.exception.ObjetInexistantException;
import com.myapp.gestionclinique.metier.rdv.IRdvMetier;

public class RdvTestU {
	
	private static ClassPathXmlApplicationContext context;
	private static IRdvMetier metier;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metier = (IRdvMetier) context.getBean("rdvMetier");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testAddRdv() throws ObjetInexistantException {
		Rdv r = new Rdv(new Date(), "motif");
		metier.addRdv(r, 2L, 2L);
		assertNotNull(r.getIdRdv());
	}

	@Test
	public void testDeleteRdv() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateRdv() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListRdv() {
		fail("Not yet implemented");
	}

}

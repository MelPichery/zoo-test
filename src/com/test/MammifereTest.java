package com.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import com.classe.Animal;
import com.classe.Mammifere;

public class MammifereTest {

	static Mammifere m;
	
	@Before
	public void setUp() {
		
		 m = new Mammifere("nom", "type", Animal.ALIMENT_OMNIVORE);
		 
	}
	
	//@Ignore
	@Test
	public void setNomtest() {
		
		m.setNom("Chouette");
		
		assertTrue(m.getNom()=="Chouette");;
		
	}
	
	@Test
	public void getTypeTest() {
		
		assertEquals("type",m.getType());
		
	}
	
	@After
	public void tearDown() {
		
		m = null ;
		
	}
	
}

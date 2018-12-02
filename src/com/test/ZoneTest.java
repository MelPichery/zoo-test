package com.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.classe.Animal;
import com.classe.Mammifere;
import com.classe.Zone;

public class ZoneTest {

	static Zone z;
	
	@Before
	public void setUp() {
		
		 z = new Zone("testZone");
		 
	}
	
	
	@Test
	public void addAnimaltest() {
		
		z.addAnimal(new Mammifere("nom","type",Animal.ALIMENT_CARNIVORE));
		
		Animal[] expected = new Animal[1];
		
		assertEquals(expected.length, z.getAnimaux().length);
	}
	
	
	@After
	public void tearDown() {
		
		z = null ;
		
	}
	
	
}

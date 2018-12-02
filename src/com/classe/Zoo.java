package com.classe;

import java.util.Arrays;

public class Zoo 
{
	private Zone[] zones = new Zone[5];
	
	public static final int INDICE_SAVANE_AFRICAINE = 0;
	public static final int INDICE_CARNIVORE = 1;
	public static final int INDICE_AQUARIUM = 2;
	public static final int INDICE_FERME_REPTILE = 3;
	public static final int INDICE_VOLIERE = 4;

	public Zoo() 
	{
		super();
		
		zones[INDICE_SAVANE_AFRICAINE] = new Zone("Savane africaine");
		zones[INDICE_CARNIVORE] = new Zone("Carnivore");
		zones[INDICE_AQUARIUM] = new Zone("Aquarium");
		zones[INDICE_FERME_REPTILE] = new Zone("Ferme aux reptiles");
		zones[INDICE_VOLIERE] = new Zone("Volière");
	}
	
	public void addAnimalToZone(Animal animal)
	{
		if (animal instanceof Mammifere)
		{
			if (animal.getRegimeAlimentaire().equals(Animal.ALIMENT_CARNIVORE))
			{
				zones[INDICE_CARNIVORE].addAnimal(animal);
			}
			else if (animal.getRegimeAlimentaire().equals(Animal.ALIMENT_HERBIVORE))
			{
				zones[INDICE_SAVANE_AFRICAINE].addAnimal(animal);
			}
		}
		else if (animal instanceof Reptile)
		{
			zones[INDICE_FERME_REPTILE].addAnimal(animal);
		}
		else if (animal instanceof Poisson)
		{
			zones[INDICE_AQUARIUM].addAnimal(animal);
		}
		else if (animal instanceof Volatile)
		{
			zones[INDICE_VOLIERE].addAnimal(animal);
		}
	}

	public Zone[] getZones() {
		return zones;
	}

	public void setZones(Zone[] zones) {
		this.zones = zones;
	}

	@Override
	public String toString() {
		
		String result = "ZOO => \r\n";
		
		for (Zone zone : zones) {
			result += zone.toString();
		}
		
		return result;
	}
	
	
	
	
}

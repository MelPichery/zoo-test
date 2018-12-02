package com.appli;

import com.classe.Animal;
import com.classe.Mammifere;
import com.classe.Poisson;
import com.classe.Reptile;
import com.classe.Volatile;
import com.classe.Zoo;

public class Main {

	public static void main(String[] args) {

		Zoo zoo = new Zoo();
		
		zoo.addAnimalToZone(new Mammifere("Daktari","Lion", Animal.ALIMENT_CARNIVORE));
		zoo.addAnimalToZone(new Mammifere("Clodette","Lion", Animal.ALIMENT_CARNIVORE));
		zoo.addAnimalToZone(new Mammifere("Fifille", "Antilope", Animal.ALIMENT_HERBIVORE));
		zoo.addAnimalToZone(new Mammifere("Zebrin", "Zèbre", Animal.ALIMENT_HERBIVORE));
		zoo.addAnimalToZone(new Poisson("Mangetout", "Requin", Animal.ALIMENT_CARNIVORE));
		zoo.addAnimalToZone(new Poisson("Marinette", "Morue", Animal.ALIMENT_CARNIVORE));
		zoo.addAnimalToZone(new Reptile("Rapacien", "Anaconda", Animal.ALIMENT_CARNIVORE));
		zoo.addAnimalToZone(new Reptile("Boate", "Boa", Animal.ALIMENT_CARNIVORE));
		zoo.addAnimalToZone(new Volatile("Picorette", "Colibri", Animal.ALIMENT_OMNIVORE));
		zoo.addAnimalToZone(new Volatile("Panachou", "Héron", Animal.ALIMENT_OMNIVORE));
		
		
		System.out.println(zoo.toString());

	}

}

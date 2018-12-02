package com.classe;

public class Zone {
	private String nom = null;
	private Animal[] animaux = null;

	public Zone(String nom) {
		super();
		this.nom = nom;
	}

	public Zone(String nom, Animal[] animaux) {
		super();
		this.nom = nom;
		this.animaux = animaux;
	}

	public void addAnimal(Animal animal) {
		Animal[] newAnimaux = null;

		if (animaux != null) {
			newAnimaux = new Animal[animaux.length + 1];

			for (int i = 0; i < animaux.length; i++) {
				newAnimaux[i] = animaux[i];
			}

			newAnimaux[animaux.length] = animal;
		} else {
			newAnimaux = new Animal[1];
			newAnimaux[0] = animal;
		}

		animaux = newAnimaux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Animal[] getAnimaux() {
		return animaux;
	}

	public void setAnimaux(Animal[] animaux) {
		this.animaux = animaux;
	}

	@Override
	public String toString() {
		String result = "\r\nZONE => " + nom.toUpperCase() + " : " + "\r\n" + "ANIMAUX => ";

		if (animaux != null) {
			for (Animal animal : animaux) {
				result += "\t" + animal.toString();
			}
		}

		return result;
	}

}

/**
 * 
 */
package fr.essais;

import fr.entites.AdressePostale;
import fr.entites.Personne;

/**
 * @author Jeremy
 *
 */
public class TestPersonne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Chef
		 */
		Personne chef = new Personne();
		chef.lastname = "DUFFOURD";
		chef.firstname = "Jean";

		/*
		 * Sous-chef
		 */
		AdressePostale sousChefAdresse = new AdressePostale(16, "rue de la framboïse", 22000, "Saint-Brieuc");

		Personne sousChefNom = new Personne("Pascal", "FREYLA");

		sousChefNom.setName("rizou", "Philippe");

		System.out.println(sousChefNom.getLasttName());

		sousChefAdresse.printAdresse();

	}

}

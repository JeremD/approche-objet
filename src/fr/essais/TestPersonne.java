/**
 * 
 */
package fr.essais;

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
		chef.nomPersonne = "Jean";
		chef.prenomPersonne = "DUFFOURD";
		chef.adressePostale = "5 Avenue des Platanes 78000 Versailles";

		/*
		 * Sous-chef
		 */
		Personne sousChef = new Personne();
		sousChef.nomPersonne = "Pascal";
		sousChef.prenomPersonne = "FREYLA";
		sousChef.adressePostale = "16 Rue de la framboïse Saint-Brieuc";

		System.out.println(sousChef.adressePostale);
		
	}

}

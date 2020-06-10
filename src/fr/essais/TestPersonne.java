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
		chef.lastname = "DUFFOURD";
		chef.firstname = "Jean";
		
		/*
		 * Sous-chef
		 */
		Personne sousChef = new Personne("Pascal", "FREYLA", "16 Rue de la framboïse 22000 Saint-Brieuc");

		System.out.println(sousChef.adress);

	}

}

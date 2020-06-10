package fr.essais;

import fr.entites.AdressePostale;

/**
 * @author Jeremy
 *
 */
public class TestAdressePostale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Premiere adresse
		 */
		AdressePostale firstAdresse = new AdressePostale(6, "Rue du château", 44100, "Nantes");

		System.out.println(firstAdresse.city);

		/*
		 * Deuxième adresse
		 */
		AdressePostale secondAdresse = new AdressePostale(23, "Avenue des Platanes", 78000, "Versailles");

	}

}

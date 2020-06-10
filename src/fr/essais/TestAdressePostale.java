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
		AdressePostale firstAdresse = new AdressePostale();
		
		firstAdresse.numeroRue = 6;
		firstAdresse.libeleVoie = "Rue du chateau";
		firstAdresse.codePostal = 44100;
		firstAdresse.ville = "Nantes";
		
		/*
		 * Deuxième adresse
		 */
		AdressePostale secondAdresse = new AdressePostale();
		
		secondAdresse.numeroRue = 23;
		secondAdresse.libeleVoie = "Avenue des Platanes";
		secondAdresse.codePostal = 78000;
		secondAdresse.ville = "Versailles";
		
	}

}

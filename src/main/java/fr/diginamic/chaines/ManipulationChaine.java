package fr.diginamic.chaines;

import java.util.Arrays;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Manipulation Chaine
 * 
 * @author Jeremy
 *
 */
public class ManipulationChaine {

	/**
	 * ManipulationChaine main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String chaine = "Durand;Marcel;012543;1 523.5";

		System.out.println("Chaîne de caractère --> " + chaine + "\r");

		// Premier charactère
		int chainePremierChar = chaine.charAt(0);
		System.out.println("Premier charactère : " + chainePremierChar);

		// Taille
		int chaineTaille = chaine.length();
		System.out.println("Taille : " + chaineTaille);

		// Index du premier élément
		int chaineIndex = chaine.indexOf(';');
		System.out.println("Index du premier élément : " + chaineIndex);

		// Extraction nom de famille et affichage en majuscule / minuscule
		String chaineNom = chaine.substring(0, chaineIndex);
		System.out.println("Nom de famille en majuscule : " + chaineNom.toUpperCase());
		System.out.println("Nom de famille en minuscule : " + chaineNom.toLowerCase());

		// Découpage de la chaine
		String[] chaineSplit = chaine.split(";");
		System.out.println("Découpage de la chaîne : " + Arrays.toString(chaineSplit) + "\r");

	}

}

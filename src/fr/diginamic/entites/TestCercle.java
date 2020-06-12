package fr.diginamic.entites;

import fr.diginamic.utils.CercleFactory;

/**
 * Exercice Cercle & Cercle Factory
 * 
 * @author Jeremy
 *
 */
public class TestCercle {

	/**
	 * TestCercle main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Cercle bleu : version classique
		Cercle blueCercle = new Cercle(5);
		System.out.println("Périmètre du cercle bleu : " + blueCercle.perimetreCercle());
		System.out.println("Surface du cercle bleu : " + blueCercle.surfaceCercle() + "\r");

		// Cercle rouge : version factory
		Cercle redCercle = CercleFactory.cercle(8.62);
		System.out.println("Périmètre du cercle rouge : " + redCercle.perimetreCercle());
		System.out.println("Surface du cercle rouge : " + redCercle.surfaceCercle() + "\r");
	}

}

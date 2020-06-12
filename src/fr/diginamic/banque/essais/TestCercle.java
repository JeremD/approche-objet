package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Cercle;

/**
 * Exercice Cercle
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

		// Premier cercle
		Cercle blueCercle = new Cercle(5);
		System.out.println("Périmètre du bleu : " + blueCercle.perimetreCercle());
		System.out.println("Surface du cercle bleu : " + blueCercle.surfaceCercle() + "\r");

		// Deuxième cercle
		Cercle redCercle = new Cercle(8.62);
		System.out.println("Périmètre du cercle rouge : " + redCercle.perimetreCercle());
		System.out.println("Surface du cercle rouge : " + redCercle.surfaceCercle() + "\r");
	}

}

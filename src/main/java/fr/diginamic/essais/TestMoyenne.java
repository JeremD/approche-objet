package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Calcul Moyenne
 * 
 * @author Jeremy
 *
 */
public class TestMoyenne {

	/**
	 * TestMoyenne main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Ajout des nombres
		CalculMoyenne.ajout(5);
		CalculMoyenne.ajout(15);
		CalculMoyenne.ajout(20);

		// Calcul moyenne
		System.out.println("Moyenne du tableau : " + CalculMoyenne.calcul());

	}

}

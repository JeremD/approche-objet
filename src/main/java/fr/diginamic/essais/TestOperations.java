package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Opérations
 * 
 * @author Jeremy
 *
 */
public class TestOperations {

	/**
	 * TestOperations main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Addition
		double addition = Operations.calcul(8, 2, '+');
		System.out.println("Addition 8 et 2 : " + addition);

		// Soustraction
		double soustraction = Operations.calcul(45.25, 0.20, '-');
		System.out.println("Soustraction 45,25 et 0,20 : " + soustraction);

		// Multiplication
		double multiplication = Operations.calcul(32, 2, '*');
		System.out.println("Multiplication 32 par 2 : " + multiplication);

		// Division
		double division = Operations.calcul(2000, 12, '/');
		System.out.println("Division 2000 par 12 : " + division);

	}

}

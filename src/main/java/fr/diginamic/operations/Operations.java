package fr.diginamic.operations;

/**
 * Exercice Operations
 * 
 * @author Jeremy
 *
 */
public class Operations {

	/**
	 * Operation calcul
	 * 
	 * @param a         premier nombre
	 * @param b         deuxième nombre
	 * @param operateur type d'opérateur
	 * @return résultat opération
	 */
	public static double calcul(double a, double b, char operateur) {
		switch (operateur) {
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default:
			return a + b;
		}
	}
}

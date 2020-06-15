/**
 * 
 */
package fr.diginamic.operations;

/**
 * Exercice Calcul Moyenne
 * 
 * @author Jeremy
 *
 */
public class CalculMoyenne {

	/* Tableau d'instance vide */
	private static double[] tableau = {};

	/**
	 * Constructor
	 * 
	 * @param tableau
	 */
	public CalculMoyenne() {
	}

	/**
	 * Ajout d'un nombre dans calcul Moyenne
	 * 
	 * @param valeur valeur à ajouter
	 * @param taille taille du tableau
	 */
	public static void ajout(double valeur) {

		// Création d'un tableau temporaire
		double[] tableauAjout = new double[tableau.length + 1];

		// Insertion contenu tableau d'instance dans tableau temporaire
		for (int i = 0; i < tableau.length; i++) {
			tableauAjout[i] = tableau[i];
		}

		// Ajout valeur selon taille tableau d'instance
		tableauAjout[tableau.length] = valeur;

		// Tableau d'instance mis à jour
		tableau = tableauAjout;
	}

	/**
	 * Calcul de la moyenne
	 * 
	 * @return Moyenne du tableau
	 */
	public static double calcul() {

		// Somme tableau
		int sommeTableau = 0;
		for (int i = 0; i < tableau.length; i++) {
			sommeTableau += tableau[i];
		}

		// Calcul moyenne
		return sommeTableau / tableau.length;
	}

}

package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Exercice Set & HashSet
 * 
 * @author Jeremy
 *
 */
public class TestSetDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Création du HashSet et ajout des nombres
		Set<Double> numberHashSet = new HashSet<>();

		numberHashSet.add(1.5);
		numberHashSet.add(8.25);
		numberHashSet.add(-7.32);
		numberHashSet.add(13.3);
		numberHashSet.add(-12.45);
		numberHashSet.add(48.5);
		numberHashSet.add(0.01);

		System.out.println(numberHashSet);

		// Recherche du plus grand nombre
		double valeurMax = numberHashSet.iterator().next();

		for (Double number : numberHashSet) {

			if (valeurMax < number) {
				valeurMax = number;
			}

		}
		System.out.println(numberHashSet);
		System.out.println("Valeur la plus grande : " + valeurMax);

		// Supprimer le plus petit élément
		double valeurMin = numberHashSet.iterator().next();

		for (Double number : numberHashSet) {

			if (valeurMin > number) {
				valeurMin = number;
			}
		}
		numberHashSet.remove(valeurMin);
		System.out.println("Nouvelle collection de Set : " + numberHashSet);
	}

}

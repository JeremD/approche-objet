package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**
 * Exercice Cercle Factory
 * @author Jeremy
 *
 */
public class CercleFactory {
	
	/**
	 * Création de cercle
	 * @param rayon
	 * @return Cercle
	 */
	public static Cercle cercle (double rayon) {
		return new Cercle(rayon);
	}
	
}

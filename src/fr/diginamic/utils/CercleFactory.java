package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**
 * Exercice Cercle Factory
 * @author Jeremy
 *
 */
public class CercleFactory {
	
	/**
	 * Création d'un cercle
	 * @param rayon
	 * @return Cercle
	 */
	public static Cercle generateCercle (double rayon) {
		return new Cercle(rayon);
	}
	
}

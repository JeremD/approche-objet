package fr.diginamic.entites;

/**
 * Exercice Cercle
 * 
 * @author Jeremy
 *
 */
public class Cercle {

	// Rayon du cercle
	private double rayon;

	/**
	 * Contructor
	 * 
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * 
	 * Calcul du périmètre du Cercle
	 * 
	 * @param double rayon
	 * @return double périmètre
	 */
	public double perimetreCercle() {
		return 2 * Math.PI * this.rayon;
	}

	/**
	 * Calcul de la surface du Cercle
	 * 
	 * @param double rayon
	 * @return double surface
	 */
	public double surfaceCercle() {
		return Math.PI * Math.pow(this.rayon, 2);
	}

}

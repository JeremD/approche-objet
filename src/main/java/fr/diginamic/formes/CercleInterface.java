package fr.diginamic.formes;

import fr.diginamic.formes.ObjetGeometrique;

/**
 * @author Jeremy
 *
 */
public class CercleInterface implements ObjetGeometrique {

	/** Rayon du cercle */ 
	private double rayon;

	
	/** Constructor
	 * @param rayon
	 */
	public CercleInterface(double rayon) {
		super();
		this.rayon = rayon;
	}

	/**
	 * 
	 * Calcul du périmètre du Cercle
	 * 
	 * @param double rayon
	 * @return double périmètre
	 */
	public double perimetre() {
		return 2 * Math.PI * this.rayon;
	}

	/**
	 * Calcul de la surface du Cercle
	 * 
	 * @param double rayon
	 * @return double surface
	 */
	public double surface() {
		return Math.PI * Math.pow(this.rayon, 2);
	}

}

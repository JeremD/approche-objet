package fr.diginamic.formes;

/**
 * @author Jeremy
 *
 */
public class RectangleInterface implements ObjetGeometrique {

	/** Longueur rectangle */
	private double longueur;

	/** Largeur rectangle */
	private double largeur;

	
	/** Constructor
	 * @param longueur
	 * @param largeur
	 */
	public RectangleInterface(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		return this.longueur * this.largeur;
	}

	@Override
	public double surface() {
		return (this.longueur + this.largeur) * 2;
	}
}

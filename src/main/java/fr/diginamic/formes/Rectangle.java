package fr.diginamic.formes;

/**
 * Forme Rectangle
 * 
 * @author Jeremy
 *
 */
public class Rectangle extends Forme {

	/* Longueur rectangle */
	protected double longueur;

	/* Largeur rectangle */
	protected double largeur;

	/**
	 * Constructeur
	 * 
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerPerimetre() {
		return this.longueur * this.largeur;
	}

	@Override
	public double calculerSurface() {
		return (this.longueur + this.largeur) * 2;
	}

}

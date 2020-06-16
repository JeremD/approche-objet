package fr.diginamic.formes;

/**
 * Forme Cercle
 * 
 * @author Jeremy
 *
 */
public class Cercle extends Forme {

	/* Rayon cercle */
	protected double rayon;
	
	/**
	 * Constructeur
	 * 
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI * this.rayon;
	}

	@Override
	public double calculerSurface() {
		return Math.PI * Math.pow(this.rayon, 2);
	}

}

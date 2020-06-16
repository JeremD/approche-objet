package fr.diginamic.maison;

/**
 * Exercice Immobilier
 * 
 * @author Jeremy
 *
 */
public abstract class Piece {

	/** superficie */
	private double superficie;

	/** numéro de l'étage */
	private int etage;

	/**
	 * Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}

}

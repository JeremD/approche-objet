package fr.diginamic.maison;

/**
 * Exercice Immobilier
 * 
 * Classe Cuisine
 * 
 * @author Jeremy
 *
 */
public class Cuisine extends Piece {

	/**
	 * Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
	}

	/**
	 * Type de pièce
	 */
	@Override
	public String getType() {
		return TYPE_CUISINE;
	}

}

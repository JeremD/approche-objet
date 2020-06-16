package fr.diginamic.maison;

/**
 * Exercice Immobilier
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

	@Override
	public String getType() {
		return TYPE_CUISINE;
	}

}

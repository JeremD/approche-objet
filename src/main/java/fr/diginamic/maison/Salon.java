package fr.diginamic.maison;

/**
 * Exercice Immobilier
 * 
 * @author Jeremy
 *
 */
public class Salon extends Piece {

	/**
	 * Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public Salon(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public String getType() {
		return TYPE_SALON;
	}

}

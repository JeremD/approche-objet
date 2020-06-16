package fr.diginamic.maison;

/**
 * Exercice Immobilier
 * 
 * @author Jeremy
 *
 */
public class Chambre extends Piece {

	/**
	 * Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public String getType() {
		return TYPE_CHAMBRE;
	}

}

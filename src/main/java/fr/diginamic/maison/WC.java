package fr.diginamic.maison;

/**
 * Exercice Immobilier
 * 
 * Classe WC
 * @author Jeremy
 *
 */
public class WC extends Piece {

	/**
	 * Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public WC(double superficie, int etage) {
		super(superficie, etage);
	}
	
	/**
	 * Type de pièce
	 */
	@Override
	public String getType() {
		return TYPE_WC;
	}

}

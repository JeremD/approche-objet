package fr.diginamic.maison;

/**
 * Exercice Immobilier
 * 
 * Classe Salon
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

	/**
	 * Type de pièce
	 */
	@Override
	public String getType() {
		return TYPE_SALON;
	}

}

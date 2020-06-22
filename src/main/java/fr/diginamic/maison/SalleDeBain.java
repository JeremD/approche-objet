package fr.diginamic.maison;

/**
 * Exercice Immobilier
 * 
 * Classe SalleDeBain
 * @author Jeremy
 *
 */
public class SalleDeBain extends Piece {

	/**
	 * Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
	}

	/**
	 * Type de pièce
	 */
	@Override
	public String getType() {
		return TYPE_SALLE_DE_BAIN;
	}

}

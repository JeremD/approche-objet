package fr.diginamic.maison;

/**
 * Exercice Immobilier
 * 
 * @author Jeremy
 *
 */
public class SalleDeBain extends Piece {

	/** Constructor
	 * @param superficie
	 * @param etage
	 */
	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public String getType() {
		return TYPE_SALLE_DE_BAIN;
	}

}

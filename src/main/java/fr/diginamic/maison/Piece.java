package fr.diginamic.maison;

/**
 * Exercice Immobilier
 * 
 * Classe abstraite pour la création de pièce
 * 
 * @author Jeremy
 *
 */
public abstract class Piece {

	/** superficie */
	private double superficie;

	/** numéro étage */
	private int etage;

	/** type chambre */
	public static final String TYPE_CHAMBRE = "Chambre";

	/** type salon */
	public static final String TYPE_SALON = "Salon";

	/** type cuisine */
	public static final String TYPE_CUISINE = "Cuisine";

	/** type WC */
	public static final String TYPE_WC = "WC";

	/** type salle de bain */
	public static final String TYPE_SALLE_DE_BAIN = "Salle de bain";

	/**
	 * Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public Piece(double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}

	public abstract String getType();

	/**
	 * Getter
	 * 
	 * @return superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * Setter
	 * 
	 * @param superficie
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * Getter
	 * 
	 * @return etage
	 */
	public int getEtage() {
		return etage;
	}

	/**
	 * Setter
	 * 
	 * @param etage
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}

}

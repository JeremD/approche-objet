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

	/** Chambre */
	public static final String TYPE_CHAMBRE = "Chambre";

	/** Salon */
	public static final String TYPE_SALON = "Salon";

	/** Cuisine */
	public static final String TYPE_CUISINE = "Cuisine";

	/** WC */
	public static final String TYPE_WC = "WC";

	/** Salle de bain */
	public static final String TYPE_SALLE_DE_BAIN = "Salle de bain";

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

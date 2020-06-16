package fr.diginamic.listes;

/**
 * Exercice Array list
 * 
 * @author Jeremy
 *
 */
public class Ville {

	/** nom */
	protected String nom;

	/** nombre d'habitants */
	protected int habitants;

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param habitants
	 */
	public Ville(String nom, int habitants) {
		this.nom = nom;
		this.habitants = habitants;
	}

	/**
	 * Getter
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return habitants
	 */
	public int getHabitants() {
		return habitants;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param habitants the habitants to set
	 */
	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}

}

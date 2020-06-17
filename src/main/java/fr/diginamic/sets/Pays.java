package fr.diginamic.sets;

/**
 * Exercice Set & HashSet
 * 
 * @author Jeremy
 *
 */
public class Pays {

	private String nom;

	private int population;

	private int PIB;

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param population
	 * @param piHab
	 */
	public Pays(String nom, int population, int piHab) {
		super();
		this.nom = nom;
		this.population = population;
		this.PIB = piHab;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
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
	 * Getter
	 * 
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * Setter
	 * 
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

	/**
	 * Getter
	 * 
	 * @return the piHab
	 */
	public int getPiHab() {
		return PIB;
	}

	/**
	 * Setter
	 * 
	 * @param PIB the piHab to set
	 */
	public void setPiHab(int PIB) {
		this.PIB = PIB;
	}

	/**
	 * Mise en forme de l'affichage
	 */
	public String toString() {
		return "Nom : " + nom + ", Population : " + population + ", PIB : " + PIB;
	}
	
	/**
	 * Calcul du PIB Total (besoin de convertir int en double)
	 * 
	 * @return
	 */
	public double getPibTotal() {
		return (double) population * (double) PIB;
	}

}

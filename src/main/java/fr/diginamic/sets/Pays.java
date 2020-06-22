package fr.diginamic.sets;

import fr.diginamic.testenumeration.Continent;

/**
 * Exercice Set & HashSet
 * 
 * @author Jeremy
 *
 */
public class Pays {

	/** nom */
	private String nom;

	/** population */
	private int population;

	/** PIB */
	private int PIB;

	/** continent */
	private Continent continent;

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param population
	 * @param PIB
	 */
	public Pays(String nom, int population, int PIB, Continent continent) {
		super();
		this.nom = nom;
		this.population = population;
		this.PIB = PIB;
		this.continent = continent;
	}

	/**
	 * Getter
	 * 
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * Setter
	 * 
	 * @param the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
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
	 * @param the nom to set
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
	 * @return the PIB
	 */
	public int getPibHab() {
		return PIB;
	}

	/**
	 * Setter
	 * 
	 * @param the PIB to set
	 */
	public void setPibHab(int PIB) {
		this.PIB = PIB;
	}

	/**
	 * Mise en forme de l'affichage
	 */
	public String toString() {
		return "Nom : " + nom + ", Population : " + population + ", PIB : " + PIB + ", Continent : " + continent;
	}

	/**
	 * Calcul du PIB Total (besoin de convertir int en double)
	 * 
	 * @return
	 */
	public double getPibTotal() {
		return (double) population * (double) PIB;
	}

	/**
	 * Tri des pays par PIB croissant
	 * 
	 * @param paysCompare
	 * @return int de compareTo
	 */
	/*
	 * @Override 
	 */

}

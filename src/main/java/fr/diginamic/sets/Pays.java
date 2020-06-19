package fr.diginamic.sets;

import fr.diginamic.testenumeration.Continent;

/**
 * Exercice Set & HashSet
 * 
 * @author Jeremy
 *
 */
public class Pays implements Comparable<Pays> {

	/** nom */
	private String nom;

	/** population */
	private int population;

	/** PIB */
	private int PIB;

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

	/**
	 * Tri des pays par ordre alphabétique
	 * 
	 * @param paysCompare
	 * @return int
	 */
	// @Override
	/*
	 * public int compareTo(Pays paysCompare) { return
	 * this.nom.compareTo(paysCompare.getNom()); }
	 */

	/**
	 * Tri des pays par PIB croissant
	 * 
	 * @param paysCompare
	 * @return int de compareTo
	 */
	@Override
	public int compareTo(Pays paysCompare) {
		// astuce pour éviter les if else pour tester 1 ou -1
		return this.PIB - paysCompare.getPiHab();
	}

}

/**
 * TP7
 */
package fr.diginamic.banque.entites;

/**
 * * @author Jeremy CompteTaux hérite de Compte
 */
public class CompteTaux extends Compte {

	double tauxRemuneration;

	/*
	 * Constructeur Ajout de tauxRemuneration
	 */
	public CompteTaux() {
		super();
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/*
	 * Reprise de toString() avec ajout du taux
	 */
	@Override
	public String toString() {
		return super.toString() + "\nTaux de rémunération : " + tauxRemuneration + " %";
	}

}

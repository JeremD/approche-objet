/**
 * TP7
 */
package fr.diginamic.banque.entites;

import Compte;

/**
 * @author Jeremy
 *
 */
public class CompteTaux extends Compte {

	double tauxRemuneration;

	/*
	 * Constructeur Ajout de tauxRemuneration
	 */
	public CompteTaux(String numberAccount, double soldeAccount, double tauxRemuneration) {
		super(numberAccount, soldeAccount);
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

/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author Jeremy
 *
 */
public abstract class Operation {

	protected String date;
	protected int montant;

	/**
	 * @param dateOperation
	 * @param montantOperation
	 */
	public Operation(String dateOperation, int montantOperation) {
		this.date = dateOperation;
		this.montant = montantOperation;
	}

	@Override
	public String toString() {
		return "Date de l'opération : " + date + "\nMontant : " + montant + " €\r";
	}

	/**
	 * Afficher type d'opération
	 */
	public abstract String afficherType();

	/*
	 * Calculer la somme totale
	 */
	public abstract double calculerSolde(double solde);

}

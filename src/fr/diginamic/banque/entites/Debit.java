/**
 * 
 */
package fr.diginamic.banque.entites;

public class Debit extends Operation {

	/**
	 * Classe fille d'Operation
	 */
	public Debit(String date, int montant) {
		super(date, montant);
	}

	@Override
	public String afficherType() {
		return "Débit";
	}

	@Override
	public double calculerSolde(double solde) {
		return solde+montant;
	}
}

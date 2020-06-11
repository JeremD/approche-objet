package fr.diginamic.banque.entites;

public class Credit extends Operation {

	/**
	 * Classe fille d'Operation 
	 * Appel de la classe mère
	 */
	public Credit(String date, int montant) {
		super(date, montant);
	}

	@Override
	public String afficherType() {
		return "Crédit";
	}
	
	@Override
	public double calculerSolde(double solde) {
		return solde-montant;
	}
}

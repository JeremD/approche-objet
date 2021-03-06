/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author Jeremy
 *
 */
public class Compte {

	private String numberAccount;
	private double soldeAccount;

	/**
	 */
	public Compte() {
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}

	public double getSoldeAccount() {
		return soldeAccount;
	}

	public void setSoldeAccount(double soldeAccount) {
		this.soldeAccount = soldeAccount;
	}

	/**
	 * On appel la méthode toString() qui affiche l'objet Compte
	 */
	@Override
	public String toString() {
		return "Informations du compte : " + numberAccount + "\nSoldes actuel : " + soldeAccount + " €";
	}

}

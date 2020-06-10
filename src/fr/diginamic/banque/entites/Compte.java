/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author Jeremy
 *
 */
public class Compte {

	int numberAccount;
	int soldeAccount;
	
	/**
	 * @param numberAccount
	 * @param soldeAccount
	 */
	public Compte(int numberAccount, int soldeAccount) {
		this.numberAccount = numberAccount;
		this.soldeAccount = soldeAccount;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public int getSoldeAccount() {
		return soldeAccount;
	}

	public void setSoldeAccount(int soldeAccount) {
		this.soldeAccount = soldeAccount;
	}
	
	
}

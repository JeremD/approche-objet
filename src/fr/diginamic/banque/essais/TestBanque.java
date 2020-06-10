/**
 * TP5
 */
package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Compte;

/**
 * @author Jeremy
 *
 */
public class TestBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Compte myAccount = new Compte (54, 5030);
		
		System.out.println(myAccount.getSoldeAccount());
	

	}

}

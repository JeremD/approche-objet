/**
 * TP5 + TP6 + TP7
 */
package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * @author Jeremy
 *
 */
public class TestBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Compte myAccount = new Compte("54", 5030);

		Compte myAccountTaux = new CompteTaux("54", 5030, 70);
		// myAccount.setSoldeAccount(640.36);

		// Affichage du compte
		System.out.println(myAccountTaux.toString());

	}

}

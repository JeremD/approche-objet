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

		// myAccount.setSoldeAccount(640.36);

		// Affichage du compte
		// System.out.println(myAccountTaux.toString());

		/*
		 * Tableau de compte Index 0 -> instance compte normal Index 1 --> compte taux
		 */

		// Compte
		Compte myAccount = new Compte();
		myAccount.setNumberAccount("54AH");
		myAccount.setSoldeAccount(7500);

		// Compte taux
		CompteTaux myAccountTaux = new CompteTaux();
		myAccountTaux.setNumberAccount("756L65");
		myAccountTaux.setSoldeAccount(56.54);
		myAccountTaux.setTauxRemuneration(80);

		// Tableau de compte
		Compte[] mesComptes = new Compte[2];
		mesComptes[0] = myAccount;
		mesComptes[1] = myAccountTaux;

		for (int i = 0; i < mesComptes.length; i++) {
			System.out.println(mesComptes[i]);

		}

	}

}

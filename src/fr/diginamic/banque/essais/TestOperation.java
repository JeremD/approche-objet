/**
 * TP8
 */
package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

/**
 * @author Jeremy
 *
 */
public class TestOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Debit firstDebit = new Debit("10/06/2020", 25);
//		Credit firstCredit = new Credit("11/06/2020", 76);

		/**
		 * Tableau Opération
		 */
		Operation[] monOperation = new Operation[2];
		monOperation[0] = new Debit("10/06/2020", 25);
		monOperation[1] = new Credit("11/06/2020", 76);

		/**
		 * Solde
		 */
		double monSolde = 0.0;

		for (int i = 0; i < monOperation.length; i++) {
			System.out.println("Type d'opération : " + monOperation[i].afficherType());
			System.out.println(monOperation[i]);

			// Calcul du sole total
			monSolde = monOperation[i].calculerSolde(monSolde);
		}
		System.out.println("Solde totale : " + monSolde);

	}

}

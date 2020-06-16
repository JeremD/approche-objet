package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Calcul Salaire
 * 
 * @author Jeremy
 *
 */
public class TestIntervenant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instance Salarie
		Salarie salarie = new Salarie("FERNAND", "Pierre", 2400);
		salarie.afficherDonnees();

		// Instance Pigiste
		Pigiste pigiste = new Pigiste("ETCHEB", "Camille", 14, 120);
		pigiste.afficherDonnees();
	}

}

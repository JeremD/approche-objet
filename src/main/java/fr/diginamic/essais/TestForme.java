package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.essais.AffichageForme;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Forme
 * 
 * @author Jeremy
 *
 */
public class TestForme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Création des variables formes
		Cercle cercle = new Cercle(18);
		Rectangle rectangle = new Rectangle(45, 22);
		Carre carre = new Carre(57.5);

		// Affichage des formes
		AffichageForme affichage = new AffichageForme();

		affichage.afficher(cercle);
		affichage.afficher(rectangle);
		affichage.afficher(carre);

	}

}

package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**
 * Affichage Forme
 * 
 * @author Jeremy
 *
 */
public class AffichageForme {

	/**
	 * Affichage périmètre et surface Forme
	 * 
	 * @param forme
	 */
	public void afficher(Forme forme) {
		System.out.println("Périmètre de la forme :  " + forme.calculerPerimetre());
		System.out.println("Surface de la forme :  " + forme.calculerSurface());
	}
}

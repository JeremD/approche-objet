package fr.diginamic.essais;

import fr.diginamic.exceptions.NumberFormatException;
import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

/**
 * 
 * Exercices en auto-formation
 * 
 * EXERCICE Immobilier
 * 
 * @author Jeremy
 *
 */
public class TestMaison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Création d'une maison
		Maison maison = new Maison();

		// Ajout des pièces (superficie + étage)
		try {
			maison.ajouterPiece(new Cuisine(15.5, 0));
			maison.ajouterPiece(new Salon(30, 0));
			maison.ajouterPiece(new Chambre(10, 1));
			maison.ajouterPiece(new Chambre(5.58, 1));
			maison.ajouterPiece(new SalleDeBain(6, 1));
			maison.ajouterPiece(new WC(1.50, 1));

			// Affichage des caractéristiques de la maison
			System.out.println("Superficie de l'étage 0 : " + maison.superficieEtage(0) + "m²");
			System.out.println("Superficie de l'étage 1 : " + maison.superficieEtage(1) + "m²");
			System.out.println("Superficie de la chambre : " + maison.superficieTypePiece(Piece.TYPE_CHAMBRE) + "m²");
			System.out.println("Superficie Total : " + maison.supercifieTotal() + "m²");

		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		}

	}

}

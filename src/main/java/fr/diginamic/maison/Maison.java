package fr.diginamic.maison;


import fr.diginamic.exceptions.NumberFormatException;

/**
 * Exercice Immobilier
 * 
 * Classe qui gère la manipulation d'une maison 
 * 
 * @author Jeremy
 *
 */
public class Maison {

	/** tableau de pieces */
	private Piece[] pieces;

	/**
	 * Constructor
	 * 
	 * Contient un tableau de pièce
	 * 
	 */
	public Maison() {
		pieces = new Piece[0];
	}

	/**
	 * Ajouter une pièce à la maison
	 * 
	 * @param newPiece nouvelle pièce à ajouter
	 */
	public void ajouterPiece(Piece newPiece) throws NumberFormatException {

		// Exception si nombre négatif pour l'étage ou la superficie 
		if (newPiece == null || newPiece.getEtage() < 0 || newPiece.getSuperficie() < 0) {
			throw new NumberFormatException("La pièce est mal renseignée");
		}

		// Angrandissement du premier tableau à chaque ajout dans un tableau tabPiece
		Piece[] tabPiece = new Piece[pieces.length + 1];

		for (int i = 0; i < pieces.length; i++) {
			tabPiece[i] = pieces[i];
		}

		// Dernière pièce à ajouter
		tabPiece[tabPiece.length - 1] = newPiece;
		this.pieces = tabPiece;
	}

	/**
	 * Retourner la superficie d'un étage
	 * 
	 * @param choixEtage choix de l'étage
	 * @return double superficie
	 */
	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;

		for (int i = 0; i < pieces.length; i++) {
			if (choixEtage == this.pieces[i].getEtage()) {
				superficieEtage = superficieEtage + this.pieces[i].getSuperficie();
			}
		}
		return superficieEtage;
	}

	/**
	 * Retourner la superficie total pour un type de pièce
	 * 
	 * @param typePiece type de pièce
	 * @return double
	 */
	public double superficieTypePiece(String typePiece) {

		double superficie = 0;

		// Appel de getType pour retourner le type de pièce
		for (int i = 0; i < pieces.length; i++) {
			if (typePiece != null && typePiece.equals(this.pieces[i].getType())) {
				superficie = superficie + this.pieces[i].getSuperficie();
			}
		}
		return superficie;
	}

	/**
	 * Retourner la surface totale
	 * 
	 * @return double
	 */
	public double supercifieTotal() {

		double totalSuperficie = 0;

		for (int i = 0; i < pieces.length; i++) {
			totalSuperficie = totalSuperficie + this.pieces[i].getSuperficie();
		}
		return totalSuperficie;
	}

}

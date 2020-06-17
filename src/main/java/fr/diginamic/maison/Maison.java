package fr.diginamic.maison;

/**
 * Exercice Immobilier
 * 
 * @author Jeremy
 *
 */
public class Maison {

	/** tableau de pieces */
	private Piece[] pieces;

	/**
	 * Constructor
	 */
	public Maison() {
		// Initialisation tableau de pièces
		pieces = new Piece[0];
	}

	/**
	 * Ajouter une pièce à la maison
	 * 
	 * @param newPiece nouvelle pièce à ajouter
	 */
	public void ajouterPiece(Piece newPiece) {

		// Gestion d'erreur si coordonées pièce inncorect
		if (newPiece == null || newPiece.getEtage() < 0 || newPiece.getSuperficie() < 0) {
			System.out.println("La pièce est incorrecte");
		}

		// Angrandissement premier tableau à chaque ajout dans un tableau tabPiece
		Piece[] tabPiece = new Piece[pieces.length + 1];

		for (int i = 0; i < pieces.length; i++) {
			tabPiece[i] = pieces[i];
		}

		// Dernière pièce à ajouter
		tabPiece[tabPiece.length - 1] = newPiece;
		this.pieces = tabPiece;
	}

	/**
	 * Retourne la superficie d'un étage
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
	 * Retourne la superficie total pour un type de pièce
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
	 * Retourne la surface totale
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

package fr.diginamic.salaire;

/**
 * Exercice Calcul Salaire
 * 
 * @author Jeremy
 *
 */
public abstract class Intervenant {

	/** nom */
	protected String nom;

	/** prenom */
	protected String prenom;

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Retourne salaire d'un intevenant
	 * 
	 * @return double Salaire
	 */
	public abstract double getSalaire();

	/**
	 * Retourne statut d'un intervenant
	 * 
	 * @return String statut
	 */
	public abstract String getStatut();

	/**
	 * Affiche données d'un intervenant
	 * 
	 * @return String
	 */
	public void afficherDonnees() {
		System.out.println("Nom : " + nom + ", prénom : " + prenom + ", salaire : " + this.getSalaire() + ", statut: "
				+ this.getStatut());
	}

}

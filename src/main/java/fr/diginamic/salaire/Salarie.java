package fr.diginamic.salaire;

/**
 * Exercie Calcul Salaire
 * 
 * @author Jeremy
 *
 */
public class Salarie extends Intervenant {

	/** montant du salaire mensuel */
	private double salaire;

	/**
	 * Constructor
	 * 
	 * @param nom     Nom salarié
	 * @param prenom  Prénom salarié
	 * @param salaire Salaire mensuel
	 */
	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {
		return this.salaire;
	}

	@Override
	public String getStatut() {
		return "salarié";
	}

}

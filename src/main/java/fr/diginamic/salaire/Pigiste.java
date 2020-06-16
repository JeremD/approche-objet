package fr.diginamic.salaire;

/**
 * Exercie Calcul Salaire
 * 
 * @author Jeremy
 *
 */
public class Pigiste extends Intervenant {

	/** nombre de jours travaillés */
	private int joursTravail;

	/** rémunération quotidienne */
	private double remuQuotid;

	/**
	 * Constructor
	 * 
	 * @param nom          Nom pigiste
	 * @param prenom       Prénom pigiste
	 * @param joursTravail nombre de jours travaillés
	 * @param remuQuotid   rémunération quotidienne
	 */
	public Pigiste(String nom, String prenom, int joursTravail, double remuQuotid) {
		super(nom, prenom);
		this.joursTravail = joursTravail;
		this.remuQuotid = remuQuotid;
	}

	@Override
	public double getSalaire() {
		return joursTravail * remuQuotid;
	}

	@Override
	public String getStatut() {
		return "pigiste";
	}

}

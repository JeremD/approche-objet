package fr.diginamic.recensement;

/**
 * Exercice en autoformation
 * 
 * Recensement population
 * 
 * @author Jeremy
 *
 */
public class Departement {

	/** nom département */
	private String nomDepartement;

	/** code département */
	private int codeDepartement;

	/**
	 * Constructor
	 * 
	 * @param nomDepartement
	 * @param populationDepartement
	 */
	public Departement(String nomDepartement, int codeDepartement) {
		this.nomDepartement = nomDepartement;
		this.codeDepartement = codeDepartement;
	}

	/**
	 * Getter
	 * 
	 * @return the nomDepartement
	 */
	public String getNomDepartement() {
		return nomDepartement;
	}

	/**
	 * Setter
	 * 
	 * @param nomDepartement the nomDepartement to set
	 */
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}

	/**
	 * Getter
	 * 
	 * @return the codeDepartement
	 */
	public int getCodeDepartement() {
		return codeDepartement;
	}

	/**
	 * Setter
	 * 
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(int codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

}

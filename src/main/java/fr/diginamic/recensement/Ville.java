package fr.diginamic.recensement;

/**
 * Exercice en autoformation
 * 
 * Recensement population
 * 
 * @author Jeremy
 *
 */
public class Ville {

	/** code région */
	private int codeRegion;

	/** nom région */
	private String nomRegion;

	/** code département */
	private String codeDepartement;

	/** code commune */
	private int codeCommune;

	/** nom commune */
	private String nomCommune;

	/** population commune */
	private long populationCommune;

	/**
	 * Constructor
	 * 
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param nomCommune
	 * @param populationCommune
	 */
	public Ville(int codeRegion, String nomRegion, String codeDepartement, int codeCommune, String nomCommune,
			long populationCommune) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationCommune = populationCommune;
	}

	/**
	 * Getter
	 * 
	 * @return nomCommune
	 */
	public String getNomCommune() {
		return this.nomCommune;
	}

	/**
	 * Setter
	 * 
	 * @param nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/**
	 * Getter
	 * 
	 * @return codeDepartement
	 */
	public String getCodeDepartement() {
		return this.codeDepartement;
	}

	/**
	 * Setter
	 * 
	 * @param codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/**
	 * Getter
	 * 
	 * @return the populationCommune
	 */
	public long getPopulationCommune() {
		return this.populationCommune;
	}

	/**
	 * Setter
	 * 
	 * @param populationCommune to set
	 */
	public void setPopulationCommune(long populationCommune) {
		this.populationCommune = populationCommune;
	}

	/**
	 * Getter
	 * 
	 * @return nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * Setter
	 * 
	 * @param the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	
	/**
	 * Afficher les informations d'une ville
	 */
	@Override
	public String toString() {
		return "Ville de " + nomCommune + " --> Code région : " + codeRegion + ", Nom région : " + nomRegion
				+ ", Code département : " + codeDepartement + ", Code Commune : " + codeCommune
				+ ",  Population Commune : " + populationCommune;
	}

}

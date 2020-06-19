package fr.diginamic.testenumeration;

/**
 * Enumérations
 * 
 * @author Jeremy
 *
 */
public enum Continent {

	EUROPE("Europe"), ASIE("Asie"), AFRIQUE("Afrique"), OCEANIE("Oceanie"), AMERIQUE("Amérique");

	/** nom continent */
	String libelle;

	/**
	 * Constructor
	 * 
	 * @param libelle
	 */
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}

package fr.entites;

/**
 * @author Jeremy
 *
 */
public class AdressePostale {

	/**
	 * Classe AdressePostale
	 */
	public int rue;
	public String libele;
	public int postalcode;
	public String city;

	public AdressePostale(int rue, String libele, int postalcode, String city) {
		this.rue = rue;
		this.libele = libele;
		this.postalcode = postalcode;
		this.city = city;
	}

}

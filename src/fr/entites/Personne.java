/**
 * 
 */
package fr.entites;

/**
 * @author Jeremy
 *
 */
public class Personne {

	/**
	 * Classe Personne
	 */
	public String lastname;
	public String firstname;
	public String adress;

	
	
	public Personne() {
		
	}


	/** Constructeur
	 * @param lastname
	 * @param firstname
	 * @param adress
	 */
	public Personne(String lastname, String firstname, String adress) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.adress = adress;
	}

}

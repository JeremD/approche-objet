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
	public static String country = "FR";

	public String lastname = "TOTO";
	public String firstname = "TITI";
	public String adress;

	public Personne() {

	}

	/**
	 * Constructeur
	 * 
	 * @param lastname  Nom
	 * @param firstname Prénom
	 * @param adress    Adresse Postale
	 */
	public Personne(String lastname, String firstname) {
		this.lastname = lastname;
		this.firstname = firstname;
	}

	/*
	 * Affichage de l'identité
	 */
	public void printName() {
		System.out.println("Nom : " + this.lastname.toUpperCase());
		System.out.println("Prénom : " + this.firstname);
	}

	/**
	 * Modifier l'identité --> setter
	 * 
	 * @param newLasttname
	 * @param newFirstname
	 */
	public void setName(String newLasttname, String newFirstname) {
		this.lastname = newLasttname;
		this.firstname = newFirstname;
	}

	/**
	 * Afficher l'identité --> getter
	 * 
	 */
	public String getLasttName() {
		return this.lastname;
	}

}

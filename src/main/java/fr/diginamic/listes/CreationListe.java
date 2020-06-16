package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeremy
 *
 */
public class CreationListe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> maListe = new ArrayList<>();
		
		// Ajout de tous les nombres de 1 à 100
		for (int i = 1; i <= 100; i++) {
			maListe.add(i);
		}
		
		System.out.println("Taille d'ArrayList : " + maListe.size());
		
	}

}

package fr.diginamic.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Exercice Set & HashSet
 * 
 * @author Jeremy
 *
 */
public class TestSetString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// HashSet stockant les pays
		Set<String> paysHashSet = new HashSet<>();
		Collections.addAll(paysHashSet, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie",
				"Inde");

		// Recherche et suppression du pays avec le plus de lettre
		String paysLong = paysHashSet.iterator().next();

		for (String pays : paysHashSet) {
			if (paysLong.length() < pays.length()) {
				paysLong = pays;
			}
		}
		paysHashSet.remove(paysLong);
		System.out.println("Nouvelle collection de pays : " + paysHashSet);

		// Trie des pays
		String[] paysArray = {"USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie",
			"Inde"} ;
		List<String> listePays = new ArrayList<>();
		listePays.addAll(Arrays.asList(paysArray));
		
		Collections.sort(listePays);
		System.out.println("Trie des pays par ordre alphabétique : " + listePays);
		
	}

}

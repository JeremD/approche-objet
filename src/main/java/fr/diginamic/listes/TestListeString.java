package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Exercice Array list
 * 
 * @author Jeremy
 *
 */
public class TestListeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Liste stockant les villes
		String[] villes = {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
		List<String> listeChar = new ArrayList<String>();
		listeChar.addAll(Arrays.asList(villes));
		
		// Nom de ville la plus longue
		String villeLongue = listeChar.get(0);
		
		for (String nomVille : listeChar) {
			if (villeLongue.length() < nomVille.length() ) {
				villeLongue = nomVille;	
			}
		}
		System.out.println("Ville avec le plus grand nombre de lettre : " + villeLongue);
		
		// Nom des villes en majuscule
		for (int i = 0; i < listeChar.size(); i++) {
			String nomVille = listeChar.get(i);
			String nomVilleMaj = nomVille.toUpperCase();
			listeChar.set(i, nomVilleMaj);
		}
		System.out.println("Ville en majuscules : " + listeChar);

		// Suppression villes commençant par la lettre N
		Iterator<String> iterator = listeChar.iterator();
		
		while (iterator.hasNext()) {
			String nomVille = iterator.next();
			if (nomVille.startsWith("N")) {
				iterator.remove();
			}
		}
		System.out.println("Nouvelle liste des villes : " + listeChar);

	}

}

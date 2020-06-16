package fr.diginamic.listes;

import java.util.ArrayList;
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

		// Liste d'entiers
		List<String> listeChar = new ArrayList<String>();
		
		listeChar.addAll("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

		// Nom de ville la plus longue
		Iterator<String> iterator = listeChar.iterator();

		while (iterator.hasNext()) {
			String ville = (String) iterator.next();
			
			/*if (ville.length() < ) {
				
			}*/
		}

	}

}

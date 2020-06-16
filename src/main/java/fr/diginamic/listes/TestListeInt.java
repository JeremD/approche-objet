package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jeremy
 *
 */
public class TestListeInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> listeEntiers = new ArrayList<Integer>();
		listeEntiers.add(-1);
		listeEntiers.add(5);
		listeEntiers.add(7);
		listeEntiers.add(3);
		listeEntiers.add(-2);
		listeEntiers.add(4);
		listeEntiers.add(8);
		listeEntiers.add(5);

		for (int i = 0; i < listeEntiers.size(); i++) {
			System.out.println(listeEntiers.get(i));
		}

		System.out.println("\rTaille liste : " + listeEntiers.size());

		// Recherche du plus grand élément
		int valueMax = listeEntiers.get(0);

		for (int i = 0; i < listeEntiers.size(); i++) {
			if (listeEntiers.get(i) > valueMax) {
				valueMax = listeEntiers.get(i);
			}
		}
		System.out.println("Plus grand élément : " + valueMax);

		
		//Iterator<Integer> iterator = listeEntiers.iterator();
		/*while (iterator.hasNext()) {
		  nombreNegatif = iterator.next();
			if (nombreNegatif > valueMax) {
			valueMax = nombreNegatif
				
			}
			
		}*/
		
		// Suppression du plus petit élément
		int valueMin = listeEntiers.get(0);
		int indexMin = 0;

		for (int i = 0; i < listeEntiers.size(); i++) {
			if (listeEntiers.get(i) < valueMin) {
				valueMin = listeEntiers.get(i);
				indexMin = i;
			}
		}
		listeEntiers.remove(indexMin);

		System.out.println("Plus petit élément supprimé à l'index n° " + indexMin);

		// Recherche éléments négatif
		int nombreNegatif;
		
		for (int i = 0; i < listeEntiers.size(); i++) {
			if (listeEntiers.get(i) < 0) {
				nombreNegatif = Math.abs(listeEntiers.get(i));
				listeEntiers.set(i, nombreNegatif);
			}
		}
		System.out.println(listeEntiers);
		
	}

}

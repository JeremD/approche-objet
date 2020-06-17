package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Exercice Map & HashMap
 * 
 * @author Jeremy
 *
 */
public class FusionMap {

	public static void main(String args[]) {

		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		// Remplissage de map3 contenant map 1 + map2
		HashMap<Integer, String> map3 = new HashMap<Integer, String>() {
		};

		map3.putAll(map1);
		map3.putAll(map2);

		System.out.println("Contenu de map1 + map2 : \n" + map3);

		// Alternatif à putAll() mais plus long
		Iterator<Integer> iteratorKey1 = map1.keySet().iterator();

		while (iteratorKey1.hasNext()) {
			Integer key1 = iteratorKey1.next();
			String value1 = map2.get(key1);

			map3.put(key1, value1);

		}

	}
}
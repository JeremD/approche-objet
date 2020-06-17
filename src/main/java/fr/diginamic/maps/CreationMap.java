package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Exercice Map & HashMap
 * 
 * @author Jeremy
 *
 */
public class CreationMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Map des salaires
		Map <String, Integer> mapSalaires = new HashMap<>();
		
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		
		// Affichage taille de la Map
		System.out.println(mapSalaires.size());
		
		
	}

}

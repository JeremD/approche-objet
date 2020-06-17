package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Exercice Map & HashMap
 * 
 * @author Jeremy
 *
 */
public class CreationEtManipulationMap {
	
	public static void main(String args[]) {
		
		// Map des villes
		HashMap<Integer, String> mapVilles = new HashMap<>();
		
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		// Ajout des villes manquantes
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		// Affichage de la map par clé
		
		Iterator<Integer> iteratorsVillesCle = mapVilles.keySet().iterator();
		
		System.out.println("Départements : ");
		while (iteratorsVillesCle.hasNext()) {
			Integer departement = iteratorsVillesCle.next();
			System.out.println(departement);
		}
		
		// Affichage de la map par valeur
		
		Iterator<String> iteratorsVillesValue = mapVilles.values().iterator();
		
		System.out.println("\rVilles : ");
		while (iteratorsVillesValue.hasNext()) {
			String nom = iteratorsVillesValue.next();
			System.out.println(nom);
		}
		
	}
}
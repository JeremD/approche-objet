package fr.diginamic.recensement;

import java.util.Comparator;

/**
 * Exercice en autoformation
 * 
 * Recensement population
 * 
 * @author Jeremy
 *
 */
public class CommunePlusPetiteComparator implements Comparator<Ville> {
	
	/**
	 * Comparator de la population croissante
	 */
	public int compare(Ville v1, Ville v2) {
		if (v1.getPopulationCommune() > v2.getPopulationCommune()) {
			return 1;
		} else if (v1.getPopulationCommune() < v2.getPopulationCommune()) {
			return -1;
		}
		return 0;
	}
}

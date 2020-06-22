package fr.diginamic.sets;

import java.util.Comparator;

/**
 * Exercice Set & HashSet
 * 
 * @author Jeremy
 *
 */
public class PaysComparator implements Comparator<Pays> {

	/**
	 * Tri des pays par ordre alphabétique
	 * 
	 * @param o1 Pays 1
	 * @param o2 Pays 2
	 * @return int value of Comparator
	 */
	public int compare(Pays o1, Pays o2) {
		return o1.getNom().compareTo(o2.getNom());
	}
}

package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jeremy
 *
 */
public class TestPays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<Pays> set = new HashSet<>();

		set.add(new Pays("USA", 328_239_523, 62606));
		set.add(new Pays("France", 69_861_344, 43551));
		set.add(new Pays("Allemagne", 82_801_531, 50206));
		set.add(new Pays("UK", 63_421_628, 43620));
		set.add(new Pays("Italie", 61_302_519, 37970));
		set.add(new Pays("Japon", 124_856_424, 42659));
		set.add(new Pays("Chine", 1_408_089_559, 16624));
		set.add(new Pays("Russie", 126_434_660, 27900));
		set.add(new Pays("Inde", 1_386_249_417, 5174));

		// Recherche du pays avec le plus grand PIB
		Pays payMax = set.iterator().next();

		for (Pays pays : set) {
			if (payMax.getPiHab() > pays.getPiHab()) {
				payMax = pays;
			}
		}
		System.out.println("Pays le plus peuplé : ");
		System.out.println(payMax.toString());

		// Recherche du pays avec le plus grand PIB total
		Pays pibTotal = set.iterator().next();

		for (Pays pays : set) {
			if (pibTotal.getPibTotal() > pays.getPibTotal()) {
				pibTotal = pays;
			}
		}
		System.out.println("\rPays avec le plus grand PIB total : ");
		System.out.println(pibTotal.toString());

		// Recherche du pays avec le plus petit PIB
		Pays payMin = set.iterator().next();

		for (Pays pays : set) {
			if (payMin.getPiHab() < pays.getPiHab()) {
				payMin = pays;
			}
		}
		System.out.println("\rPays avec le plus petit PIB :  ");
		System.out.println(payMin.toString());

	}

}

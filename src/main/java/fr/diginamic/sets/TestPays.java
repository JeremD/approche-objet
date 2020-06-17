package fr.diginamic.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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

		Set<Pays> setPays = new HashSet<>();

		setPays.add(new Pays("USA", 328_239_523, 62606));
		setPays.add(new Pays("France", 69_861_344, 43551));
		setPays.add(new Pays("Allemagne", 82_801_531, 50206));
		setPays.add(new Pays("UK", 63_421_628, 43620));
		setPays.add(new Pays("Italie", 61_302_519, 37970));
		setPays.add(new Pays("Japon", 124_856_424, 42659));
		setPays.add(new Pays("Chine", 1_408_089_559, 16624));
		setPays.add(new Pays("Russie", 126_434_660, 27900));
		setPays.add(new Pays("Inde", 1_386_249_417, 5174));

		// Recherche du pays avec le plus grand PIB
		Pays payMax = setPays.iterator().next();

		for (Pays pays : setPays) {
			if (payMax.getPiHab() > pays.getPiHab()) {
				payMax = pays;
			}
		}
		System.out.println("Pays le plus peuplé : ");
		System.out.println(payMax.toString());

		// Recherche du pays avec le plus grand PIB total
		Pays pibTotal = setPays.iterator().next();

		for (Pays pays : setPays) {
			if (pibTotal.getPibTotal() > pays.getPibTotal()) {
				pibTotal = pays;
			}
		}
		System.out.println("\rPays avec le plus grand PIB total : ");
		System.out.println(pibTotal.toString());

		// Recherche du pays avec le plus petit PIB
		Pays payMin = setPays.iterator().next();

		for (Pays pays : setPays) {
			if (payMin.getPiHab() < pays.getPiHab()) {
				payMin = pays;
			}
		}
		System.out.println("\rPays avec le plus petit PIB :  ");
		System.out.println(payMin.toString());
		
		// Tri des pays avec compareTo() selon le critère féfinis
		List<Pays> listePays = new ArrayList<>();
		listePays.addAll(setPays);
		
		Collections.sort(listePays);
		
		// Boucle pour parcourir tous les pays
		for (Pays pays : listePays) {
			//System.out.println(pays.getNom());
			System.out.println(pays.getNom() + pays.getPibTotal());
		}
		
		// Tri sur le pays le plus peuplé
		//Collections.sort(listePays, new ComparatorPIBHabitant());

	}

}

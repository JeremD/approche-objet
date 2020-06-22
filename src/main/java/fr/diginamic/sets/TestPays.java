package fr.diginamic.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.diginamic.testenumeration.Continent;

/**
 * Set & Enum
 * 
 * @author Jeremy
 *
 */
public class TestPays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<Pays> setPays = new HashSet<>();

		setPays.add(new Pays("USA", 328_239_523, 62606, Continent.AMERIQUE));
		setPays.add(new Pays("France", 69_861_344, 43551, Continent.EUROPE));
		setPays.add(new Pays("Allemagne", 82_801_531, 50206, Continent.EUROPE));
		setPays.add(new Pays("UK", 63_421_628, 43620, Continent.EUROPE));
		setPays.add(new Pays("Italie", 61_302_519, 37970, Continent.EUROPE));
		setPays.add(new Pays("Japon", 124_856_424, 42659, Continent.ASIE));
		setPays.add(new Pays("Chine", 1_408_089_559, 16624, Continent.ASIE));
		setPays.add(new Pays("Russie", 126_434_660, 27900, Continent.ASIE));
		setPays.add(new Pays("Inde", 1_386_249_417, 5174, Continent.ASIE));

		// Recherche du pays le plus peuplée
		Pays payMax = setPays.iterator().next();

		for (Pays pays : setPays) {
			if (payMax.getPopulation() < pays.getPopulation()) {
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
			if (payMin.getPibHab() > pays.getPibHab()) {
				payMin = pays;
			}
		}
		System.out.println("\rPays avec le plus petit PIB :  ");
		System.out.println(payMin.toString() + "\r");

		// Tri des pays avec compareTo() selon le critère féfinis
		List<Pays> listePays = new ArrayList<>();
		listePays.addAll(setPays);

		Collections.sort(listePays, new PaysComparator());

		// Boucle pour parcourir tous les pays et les afficher en majuscule
		System.out.println("Pays par ordre alphabétique : ");
		for (Pays pays : listePays) {
				pays.setNom(pays.getNom().toUpperCase());
			System.out.println(pays.getNom());
		}

		// --------------------------------------------------------------------//
		// Enum
		Set<Pays> enumPays = new HashSet<>();
		enumPays.add(new Pays("USA", 328_239_523, 62606, Continent.AMERIQUE));

		// Compteur pour parcourir chaque continent
		Map<Continent, Integer> comptage = new HashMap<>();

		for (Continent continent : Continent.values()) {
			comptage.put(continent, 0);
		}

		// Comptage des continents
		for (Pays pays : setPays) {
			Integer compteur = comptage.get(pays.getContinent());
			compteur++;
			comptage.put(pays.getContinent(), compteur);
		}

		System.out.println("\rNombre de pays par continent : " + comptage);

	}

}

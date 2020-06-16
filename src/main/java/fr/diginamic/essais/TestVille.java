package fr.diginamic.essais;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.listes.Ville;

/**
 * Exercice Array list
 * 
 * @author Jeremy
 *
 */
public class TestVille {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ArrayList contenant les attributs de Ville
		List<Ville> listeVille = new ArrayList<>();

		listeVille.add(new Ville("Nice", 343000));
		listeVille.add(new Ville("Carcassonne", 47800));
		listeVille.add(new Ville("Narbonne", 53400));
		listeVille.add(new Ville("Lyon", 484000));
		listeVille.add(new Ville("Foix", 9700));
		listeVille.add(new Ville("Pau", 77200));
		listeVille.add(new Ville("Marseille", 580700));
		listeVille.add(new Ville("Tarbes", 40600));

		// Récupération du nombre d'habitant
		Iterator<Ville> iterator = listeVille.iterator();

		int villeMax = 0;
		String villeNom = "";

		while (iterator.hasNext()) {
			Ville ville = iterator.next();

			int getHabitant = ville.getHabitants();

			if (villeMax < getHabitant) {
				villeMax = getHabitant;
				villeNom = ville.getNom();
			}

		}
		System.out.println("Ville la plus peuplée : " + villeNom);

	}

}

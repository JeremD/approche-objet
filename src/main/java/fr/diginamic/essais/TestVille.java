package fr.diginamic.essais;

import java.util.ArrayList;
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

		listeVille.add(new Ville("Nice", 343_000));
		listeVille.add(new Ville("Carcassonne", 47_800));
		listeVille.add(new Ville("Narbonne", 53_400));
		listeVille.add(new Ville("Lyon", 484_000));
		listeVille.add(new Ville("Foix", 9_700));
		listeVille.add(new Ville("Pau", 77_200));
		listeVille.add(new Ville("Marseille", 580_700));
		listeVille.add(new Ville("Tarbes", 40_600));

		// Ville la plus peuplée
		Ville maxVille = listeVille.get(0);
		for (Ville ville : listeVille) {
			if (ville.getHabitants() > maxVille.getHabitants()) {
				maxVille = ville;
			}
		}
		System.out.println("Ville la plus peuplée : " + maxVille.getNom() + "\r");

		// Supprimer ville la moins peuplée
		Ville minVille = listeVille.get(0);
		for (Ville ville : listeVille) {
			if (ville.getHabitants() < minVille.getHabitants()) {
				minVille = ville;
			}
		}
		listeVille.remove(minVille);

		System.out.println("Villes restantes : ");
		for (Ville ville : listeVille) {
			System.out.println(ville.getNom());
		}

		// Villes en majusucles si plus de 100 000 habitants
		for (Ville ville : listeVille) {
			if (ville.getHabitants() > 100_000) {
				String nomVille = ville.getNom();
				String nomVilleMaj = nomVille.toUpperCase();
				ville.setNom(nomVilleMaj);
			}
		}
		
		System.out.println("\rVilles avec + de 100 000 habitants en majusucle : ");
		for (Ville ville : listeVille) {
			System.out.println(ville.getNom());
		}
		
	}

}

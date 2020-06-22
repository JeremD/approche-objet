package fr.diginamic.recensement;

import java.io.IOException;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**
 * Exercice en autoformation
 * 
 * Recensement population
 * 
 * @author Jeremy
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			// Déclaration du fichier à lire
			File csvFile = new File("E:/Documents/DEV/Formations/tp 6 - DATA - recensement 2010.csv");

			// Lignes du fichier stockées dans une List
			List<String> csvLignes = FileUtils.readLines(csvFile, "UTF-8");

			// Ommit de l'entête du csv
			csvLignes.remove(0);

			// Instantiation Ville dans un ArrayList
			List<Ville> listeVille = new ArrayList<>();

			// Parcours lignes par lignes
			for (String lectureLignes : csvLignes) {

				// Découpage des champs du CSV
				String[] csvSplit = lectureLignes.split(";");

				// Ajout des données du csv dans l'ArrayList
				int codeRegion = Integer.parseInt(csvSplit[0]);
				String nomRegion = csvSplit[1];
				String codeDepartement = csvSplit[2];
				int codeCommune = Integer.parseInt(csvSplit[5]);
				String nomCommune = csvSplit[6];

				// Suppression des espaces génants pour les nombres
				String formatNombre = csvSplit[9].replaceAll("\\s+", "");
				long populationCommune = Long.parseLong(formatNombre);

				// Ajout des villes dans l'ArrayList
				listeVille.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationCommune));
			}

			// Affichage des coordonnées de toutes les villes
			//System.out.println(arrayVille.toString());

			// Variables pour trouver les populations via l'iterator
			long populationDepartement = 0;
			long plusPetiteVille = Long.MAX_VALUE;
			String nomPetitVille = "";

			// Itérator pour parcourir la liste des villes
			Iterator<Ville> iteratorVille = listeVille.iterator();
			
			while (iteratorVille.hasNext()) {
				Ville ville = iteratorVille.next();

				// Affichage des informations sur Montpellier
				if (ville.getNomCommune().equals("Montpellier")) {
					System.out.println(ville);
				}

				// Addition de la population totale pour l'Hérault
				if (ville.getCodeDepartement().equals("34")) {
					populationDepartement = populationDepartement + ville.getPopulationCommune();
				}

				// Affichage de la plus petite ville
				if (ville.getPopulationCommune() < plusPetiteVille) {
					plusPetiteVille = ville.getPopulationCommune();
					nomPetitVille = ville.getNomCommune();
				}

			}
			System.out.println("\rPopulation totale de l'Hérault : " + populationDepartement + " habitants\r");
			System.out.println("Ville la plus petite : " + nomPetitVille);

			//---------------------------------------------------
			// Recherche des 10 plus grandes villes de l’Hérault
			
			// Stockage des communes de l’Hérault dans un nouvel ArrayList
			ArrayList<Ville> villeHerault = new ArrayList<>();

			// Ajout de chaque ville depuis la liste des villes
			for (int i = 0; i < listeVille.size(); i++) {
				Ville addVille = listeVille.get(i);
				
				if (addVille.getCodeDepartement().equals("34")) {
					villeHerault.add(addVille);
				}
			}
			
			// Tri et affichage des 10 plus grandes villes de l’Hérault
			Collections.sort(villeHerault, new CommunePlusGrandeComparator());
			System.out.println("\rLes 10 plus grandes villes de l’Hérault : ");

			for (int i = 0; i < 10; i++) {
				System.out.println(villeHerault.get(i).getNomCommune());
			}
			
			// Tri et affichage des 10 plus petites villes de l’Hérault
			Collections.sort(villeHerault, new CommunePlusPetiteComparator());
			System.out.println("\rLes 10 plus petites villes de l’Hérault : ");

			for (int i = 0; i < 10; i++) {
				System.out.println(villeHerault.get(i).getNomCommune());
			}
			
			// Alimentation de la map (commune + population)
			/*HashMap<String, Long> mapVille = new HashMap<>();

			for (Ville ville : arrayVille) {
				if (ville.getCodeDepartement().equals("34")) {
					mapVille.put(ville.getNomCommune(), ville.getPopulationCommune());
				}
			}
			
			// Parcours de la map
			Iterator<String> valueMapVille = mapVille.keySet().iterator();
			
			String plusGrandVilles = "";
			
			Collections.sort(list);*/
			
			/*while (valueMapVille.hasNext()) {
				plusGrandVilles = valueMapVille.next();
			}*/

			/*System.out.println("Les 10 plus grandes villes de l’Hérault : ");
			for (int i = 0; i < 10; i++) {
				System.out.println(plusGrandVilles);
			}*/
			

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}

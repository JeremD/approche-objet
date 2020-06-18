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
			List<Ville> arrayVille = new ArrayList<>();

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

				// Suppression des espaces génants dans les nombres
				String formatNombre = csvSplit[9].replaceAll("\\s+", "");
				long populationCommune = Long.parseLong(formatNombre);

				// Ajout dans l'ArrayList
				arrayVille.add(
						new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationCommune));

			}

			// Affichage des villes
			// System.out.println(arrayVille.toString());

			// variable pour trouver les populations dans l'iterator
			long populationDepartement = 0;
			long plusPetiteVille = Long.MAX_VALUE;
			String nomPetitVille = "";

			// Parcours des villes
			Iterator<Ville> iteratorVille = arrayVille.iterator();
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
			System.out.println("Population totale de l'Herault : " + populationDepartement + " habitants");

			System.out.println("Ville la plus petite : " + nomPetitVille);

			
			 //Collections.sort(arrayVille, new Ville(0, nomPetitVille, nomPetitVille, 0,
			 //nomPetitVille, plusPetiteVille));
			
			 //for (Ville triPopulation : arrayVille) { System.out.println(triPopulation); }

			// Affichage des 10 plus grandes villes de l’Hérault
			
			// Alimentation de la map
			HashMap<String, Long> mapVille = new HashMap<>();

			for (Ville ville : arrayVille) {
				if (ville.getCodeDepartement().equals("34")) {
					mapVille.put(ville.getCodeDepartement(), ville.getPopulationCommune());
				}
			}
			
			Ville villeMax = mapVille.values().iterator().next();

			// Recherche des 10 plus grandes villes de l’Hérault
			/*for (Ville ville : arrayVille.values()) {
				if (ville.getPopulationCommune() > villeMax.getPopulationCommune()) {
					villeMax = ville;
					System.out.println(ville);
				}
			}*/

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

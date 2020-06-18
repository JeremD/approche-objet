package fr.diginamic.recensement;

import java.io.IOException;

import java.io.File;
import java.util.ArrayList;
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
				long populationTotale = Long.parseLong(formatNombre);

				arrayVille.add(
						new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale));

			}

			// Affichage des ville
			//System.out.println(arrayVille.toString());

			// Parcours des villes
			Iterator<Ville> iteratorVille = arrayVille.iterator();
			while (iteratorVille.hasNext()) {
				Ville ville = iteratorVille.next();

				// Affichage des informations sur Montpellier
				if (ville.getNomCommune().equals("Montpellier")) {
					System.out.println(ville);
				}
				
				// Affichage de la population totale de l'Hérault
				int populationDepartement = 0;
				
				if (ville.getCodeDepartement().equals("34")) {
					System.out.println(ville.getPopulationCommune());
				}

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

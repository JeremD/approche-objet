package fr.diginamic.fichier;

import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;

import java.io.IOException;

/**
 * TP Lecture Fichier
 * 
 * @author Jeremy
 *
 */
public class LectureFichier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// Déclaration du fichier à lire
			File csvFile = new File("C:/tp 6 - DATA - recensement 2010.csv");

			// Lecture du fichier
			List<String> csvLignes = FileUtils.readLines(csvFile, "UTF-8");

			for (String read : csvLignes) {
				System.out.println(read);

			}
			System.out.println("Nombre de lignes : " + csvLignes.size());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}

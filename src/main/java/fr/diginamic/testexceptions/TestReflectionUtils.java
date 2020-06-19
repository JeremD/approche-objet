package fr.diginamic.testexceptions;

import fr.diginamic.exceptions.ReflectionException;
import fr.diginamic.sets.Pays;
import fr.diginamic.testenumeration.Continent;

/**
 * Gestion des Exceptions
 * 
 * @author Jeremy
 *
 */
public class TestReflectionUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Pays exceptPays = new Pays("Tamalou", 1_800_000, 6597, Continent.OCEANIE);

		try {
			ReflectionUtils.afficherAttributs(exceptPays);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.out.println(e.getMessage());
		}

	}

}

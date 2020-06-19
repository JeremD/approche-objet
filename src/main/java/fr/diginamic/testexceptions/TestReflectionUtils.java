package fr.diginamic.testexceptions;

import fr.diginamic.exceptions.ReflectionException;
import fr.diginamic.sets.Pays;

/**
 * Gestion des Exceptiosn
 * 
 * @author Jeremy
 *
 */
public class TestReflectionUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Pays exceptPays = new Pays("Tamalou", 1_800_000, 6597);

		try {
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.out.println(e.getMessage());
		}

	}

}

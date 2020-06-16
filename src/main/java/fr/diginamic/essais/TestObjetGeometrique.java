package fr.diginamic.essais;

import fr.diginamic.formes.CercleInterface;
import fr.diginamic.formes.ObjetGeometrique;
import fr.diginamic.formes.RectangleInterface;

/**
 * @author Jeremy
 *
 */
public class TestObjetGeometrique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ObjetGeometrique[] objetTab = new ObjetGeometrique[2];
		objetTab[0] = new CercleInterface(5);
		objetTab[1] = new RectangleInterface(9, 5.6);

		for (int i = 0; i < objetTab.length; i++) {
			System.out.println(objetTab[i].perimetre());
		}
	}

}

package fr.diginamic.dates;

import fr.diginamic.utils.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jeremy
 *
 */
public class TestDates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Instanciation de la date
		Date maDate = DateUtils.getDate(2020, 5, 19, 23, 59, 30);

		// Formattage et affichage date
		SimpleDateFormat formatCalendrier = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
		
		System.out.println(formatCalendrier.format(maDate));
	}

}

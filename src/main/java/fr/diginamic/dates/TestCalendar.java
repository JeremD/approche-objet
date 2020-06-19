package fr.diginamic.dates;

import java.util.Date;

import fr.diginamic.utils.DateUtils;

import java.text.SimpleDateFormat;

/**
 * @author Jeremy
 *
 */
public class TestCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Instanciation du calendrier
		Date monCalendrier = DateUtils.getDate(2019, 8, 19, 23, 59, 30);

		// Formattage et affichage date
		SimpleDateFormat formatage = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
				
		System.out.println(formatage.format(monCalendrier));
		
	}

}

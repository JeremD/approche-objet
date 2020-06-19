package fr.diginamic.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * Classe utilitaire
 * 
 * @author Jeremy
 *
 */
public class DateUtils {

	/**
	 * Générateur de date d'un calendrier
	 * 
	 * @param year l'année
	 * @param month le mois
	 * @param day le jour
	 * @param hour l'heure
	 * @param minute la minute
	 * @param second la seconde
	 * @return la date du calendrier
	 */
	public static Date getDate (int year, int month, int day, int hour, int minute, int second) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, hour);
		cal.set(Calendar.MINUTE, minute);
		cal.set(Calendar.SECOND, second);
		
		return cal.getTime();
	}
}

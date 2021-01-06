/**
 * 
 */
package org.javaturk.oopj.ch13.dateAndTime.oldApi;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author akin
 *
 */
public class FormatExample {

	/**
	 * @author akin
	
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar calendar1 = new GregorianCalendar();
//		 calendar1.set(Calendar.YEAR, 2000);
//		 calendar1.set(Calendar.MONTH, Calendar.APRIL);
//		 calendar1.set(Calendar.DATE, 4);
//		 calendar1.set(Calendar.HOUR, 20);
//		 calendar1.set(Calendar.MINUTE, 41);
//		 calendar1.set(Calendar.SECOND, 14);
//		 calendar1.set(Calendar.MILLISECOND, 148);
		 
		 formatDate(calendar1, Locale.US);
		 formatDate(calendar1, new Locale("tr"));
//		 
		 formatTime(calendar1, Locale.US);
		 formatTime(calendar1, new Locale("tr"));
//		 
		 formatDateAndTime(calendar1, Locale.US);
		 formatDateAndTime(calendar1, new Locale("tr"));
	}
	
	public static void formatDate(Calendar calendar, Locale locale){
		 System.out.println("Formatting date using locale: " + locale);
		 
		 DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		 String formattedDob1 = df1.format(calendar.getTime());
		 System.out.println("SHORT: " + formattedDob1);
		 
		 DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		 String formattedDob2 = df2.format(calendar.getTime());
		 System.out.println("MEDUIM: " + formattedDob2);
		 
		 DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG, locale);
		 String formattedDob3 = df3.format(calendar.getTime());
		 System.out.println("LONG: " + formattedDob3);
		 
		 DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locale);
		 String formattedDob4 = df4.format(calendar.getTime());
		 System.out.println("FULL: " + formattedDob4);
		 System.out.println();
	}
	
	public static void formatTime(Calendar calendar, Locale locale){
		 System.out.println("Formatting time using locale: " + locale);
		 
		 Date time = calendar.getTime();
		 
		 DateFormat df1 = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		 String formattedDob1 = df1.format(time);
		 System.out.println("SHORT: " + formattedDob1);
		 
		 DateFormat df2 = DateFormat.getTimeInstance(DateFormat.MEDIUM, locale);
		 String formattedDob2 = df2.format(calendar.getTime());
		 System.out.println("MEDUIM: " + formattedDob2);
		 
		 DateFormat df3 = DateFormat.getTimeInstance(DateFormat.LONG, locale);
		 String formattedDob3 = df3.format(calendar.getTime());
		 System.out.println("LONG: " + formattedDob3);
		 
		 DateFormat df4 = DateFormat.getTimeInstance(DateFormat.FULL, locale);
		 String formattedDob4 = df4.format(calendar.getTime());
		 System.out.println("FULL: " + formattedDob4);
		 System.out.println();
	}
	
	public static void formatDateAndTime(Calendar calendar, Locale locale){
		 System.out.println("Formatting date & time using locale: " + locale);
		 
		 DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, locale);
		 String formattedDob1 = df1.format(calendar.getTime());
		 System.out.println("SHORT: " + formattedDob1);
		 
		 DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, locale);
		 String formattedDob2 = df2.format(calendar.getTime());
		 System.out.println("MEDUIM: " + formattedDob2);
		 
		 DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		 String formattedDob3 = df3.format(calendar.getTime());
		 System.out.println("LONG: " + formattedDob3);
		 
		 DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale);
		 String formattedDob4 = df4.format(calendar.getTime());
		 System.out.println("FULL: " + formattedDob4);
		 System.out.println();
	}
}

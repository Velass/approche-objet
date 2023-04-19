package fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalandar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		//System.out.println(date);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy",Locale.FRANCE );
		String chaine1 = formateur.format(date);
		System.out.println(chaine1);
		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		String chaine2 = formateur.format(date2);
		System.out.println(chaine2);
		Locale RUSSIE = new Locale ("ru","RU");
		SimpleDateFormat formateur2 = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss",Locale.FRANCE );
		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy MMMMM dd HH:mm:ss",Locale.CHINESE );
		SimpleDateFormat formateur4 = new SimpleDateFormat("yyyy MMMMM dd HH:mm:ss",Locale.GERMAN );
		SimpleDateFormat formateur5 = new SimpleDateFormat("yyyy MMMMM dd HH:mm:ss",RUSSIE );
		String chaine3 = formateur2.format(date2);
		String chaine4 = formateur3.format(date2);
		String chaine5 = formateur4.format(date2);
		String chaine6 = formateur5.format(date2);
		System.out.println(chaine3);
		System.out.println(chaine4);
		System.out.println(chaine5);
		System.out.println(chaine6);
		
		
		
	}

}

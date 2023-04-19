package fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(123,3,19);
		//System.out.println(d1);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
		String chaine1 = formateur.format(d1);
		System.out.println(chaine1);
		Date d2 = new Date(116,4,19,23,59,30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.FRANCE);
		String chaine2 = formateur2.format(d2);
		System.out.println(chaine2);
	}

}

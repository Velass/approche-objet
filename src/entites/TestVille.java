package entites;

import java.util.ArrayList;
import java.util.Collections;

import entites2.Ville;
import entites2.VilleComparator;


public class TestVille {

	public static void main(String[] args) {
		Ville ville1 = new Ville("test4", 10000);
		Ville ville2 = new Ville("test3", 8000);
		Ville ville3 = new Ville("test2", 150000);
		Ville ville4 = new Ville("test1", 500);

		ArrayList<Ville> liste = new ArrayList<Ville>();
		Collections.addAll(liste, ville1, ville2, ville3, ville4);
		Collections.sort(liste, new VilleComparator());
		System.out.println(liste);
		
	}

}

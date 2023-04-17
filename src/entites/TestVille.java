package entites;

import java.util.ArrayList;
import java.util.Collections;

import entites2.VilleNom;

public class TestVille {

	public static void main(String[] args) {
		VilleNom ville1 = new VilleNom("test4", 10000);
		VilleNom ville2 = new VilleNom("test3", 8000);
		VilleNom ville3 = new VilleNom("test2", 150000);
		VilleNom ville4 = new VilleNom("test1", 500);

		ArrayList<VilleNom> liste = new ArrayList<VilleNom>();
		Collections.addAll(liste, ville1, ville2, ville3, ville4);
		Collections.sort(liste);
		System.out.println(liste);
		
	}

}

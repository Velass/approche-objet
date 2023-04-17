package entites;

import java.util.ArrayList;
import java.util.Collections;

import entites2.VilleNbrPersonne;
import entites2.VilleNom;

public class TestVille {

	public static void main(String[] args) {
		VilleNbrPersonne ville1 = new VilleNbrPersonne("test4", 10000);
		VilleNbrPersonne ville2 = new VilleNbrPersonne("test3", 8000);
		VilleNbrPersonne ville3 = new VilleNbrPersonne("test2", 150000);
		VilleNbrPersonne ville4 = new VilleNbrPersonne("test1", 500);

		ArrayList<VilleNbrPersonne> liste = new ArrayList<VilleNbrPersonne>();
		Collections.addAll(liste, ville1, ville2, ville3, ville4);
		Collections.sort(liste);
		System.out.println(liste);
		
	}

}

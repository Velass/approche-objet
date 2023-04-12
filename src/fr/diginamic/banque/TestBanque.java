package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
	public static void main(String[] args) {

		Compte cpt = new Compte("a1245", 755500);
		System.out.println(cpt);

		// TP 7
		Compte cptNormal = new Compte("A0", 100);
		CompteTaux livretA = new CompteTaux("l0", 100, 100);

		Compte[] comptes = { cptNormal, livretA };

		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
		}

	}
}
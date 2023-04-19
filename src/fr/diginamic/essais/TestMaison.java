package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Maison;

public class TestMaison {

	public static void main(String[] args) {
		Maison maison1 = new Maison();
		Chambre ch1 = new Chambre( 10, 0);
		maison1.ajouterPiece(ch1);
		System.out.println(maison1);
	}

}

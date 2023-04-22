package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;

public class TestMaison {

	public static void main(String[] args) {
		Maison maison1 = new Maison();
		Chambre ch1 = new Chambre( 10, 0);
		Chambre ch2 = new Chambre(15,0);
		Chambre ch3 = new Chambre(15,1);
		SalleDeBain sdb1 = new SalleDeBain(20,1);
		maison1.ajouterPiece(ch1);
		maison1.ajouterPiece(ch2);
		maison1.ajouterPiece(ch3);
		maison1.ajouterPiece(sdb1);
		System.out.println(maison1);
		double superficieMaison1 = maison1.calculerSuperficieTotale();
		System.out.println(superficieMaison1);
		double superficieetage = maison1.calculerSuperficieEtage(1);
		System.out.println(superficieetage);
		double superficiePiece = maison1.calculerSuperficiePiece("Chambre");
		System.out.println(superficiePiece);
		int compterPieces = maison1.compterPieces("Chambre");
		System.out.println(compterPieces);
	}

}

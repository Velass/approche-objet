package fr.diginamic.essais;

import fr.diginamic.entities.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
public static void main(String [] args) {
	
// Exercice Cercle
		Cercle cercle1 = new Cercle(5);
		Cercle cercle2 = new Cercle(10);
		double test1 = cercle1.surface();
		double test2 = cercle2.surface();
		System.out.println(test1);
		System.out.println(test2);
		double test3 = cercle1.perimetre();
		double test4 = cercle2.perimetre();
		System.out.println(test3);
		System.out.println(test4);
		
		//Exercice CercleFactory
		Cercle cercle3 = CercleFactory.creaCercle(15);
		System.out.println(cercle3);
	}

}


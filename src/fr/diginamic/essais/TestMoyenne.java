package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	public static void main(String [] args) {
		double[] tab = {20, 20, 50, 100};
		CalculMoyenne tab1= new CalculMoyenne(tab);
		System.out.println(tab1);
		tab1.ajoutTab(10);
		System.out.println(tab1);
		System.out.println(tab1.calculMoyenne());
	}
}

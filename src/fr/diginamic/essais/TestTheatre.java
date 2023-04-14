package fr.diginamic.essais;

import entites.Theatre;
public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre1 = new Theatre("leTheatre", 30 , 25, 300);
		Theatre theatre2 = new Theatre("leTheatre", 30 , 30, 300);
		System.out.println(theatre1);
		theatre1.inscrire(6,10);
		System.out.println(theatre1);
		theatre1.inscrire(6,10);
		System.out.println(theatre2);
	}

}

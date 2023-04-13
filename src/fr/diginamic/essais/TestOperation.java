package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperation {

	public static void main(String[] args) {
		Operations ope1 = new Operations(1,2,'+');
		System.out.println(ope1);
		double test = ope1.Calcul();
		System.out.println(test);
		
	}
	
}

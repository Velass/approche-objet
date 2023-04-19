package equals;

import entites2.Ville;

public class TestEquals {

    
	public static void main(String[] args) {
		Ville ville1 = new Ville("Montpellier", 10);
		Ville ville2 = new Ville("Montpellier", 10);
		
		if(ville1.equals(ville2) ) {
			System.out.println("ok");
		}else {
			System.out.println("non");
		}
	}
}

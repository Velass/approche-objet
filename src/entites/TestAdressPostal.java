package entites;

public class TestAdressPostal {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroDeRue = 1;
		adresse1.libelleDeLaRue = "test";
		adresse1.codePostal = 34000;
		adresse1.ville = "montpellier";
		
		AdressePostale adresse2= new AdressePostale();
		adresse1.numeroDeRue = 2;
		adresse1.libelleDeLaRue = "test2";
		adresse1.codePostal = 34000;
		adresse1.ville = "montpellier";
	}

}

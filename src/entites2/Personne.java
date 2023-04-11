package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse ;
	
	public Personne(String leNom,String lePrenom ){
	nom = leNom;
	prenom = lePrenom;
	
	}

	public  Personne(String leNom,String lePrenom, AdressePostale ladressePostal ){
	nom = leNom;
	prenom = lePrenom;
	adresse = ladressePostal ;
	}
}

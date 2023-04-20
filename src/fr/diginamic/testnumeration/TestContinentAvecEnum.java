package fr.diginamic.testnumeration;


import java.util.ArrayList;
import java.util.List;

import fichier.Continent;
import fichier.Ville2;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		List<Ville2> lesVilles = new ArrayList<Ville2>() ;
		lesVilles.add( new Ville2("New York",10,Continent.AMERIQUE));
		lesVilles.add( new Ville2("Paris",20,Continent.EUROPE));
		lesVilles.add( new Ville2("Pekin",10,Continent.ASIE));
		lesVilles.add( new Ville2("Moscou",10,Continent.ASIE));
		lesVilles.add( new Ville2("Berlin",10,Continent.EUROPE));
		lesVilles.add( new Ville2("Sydney",10,Continent.OCEANIE));
		lesVilles.add( new Ville2("Sao Paulo",10,Continent.AMERIQUE));
		lesVilles.add( new Ville2("Dakar",10,Continent.AFRIQUE));
		for (Ville2 element : lesVilles) {
			System.out.println(element);
			
		}
	}

}

package fr.diginamic.testnumeration;


public class TestEnumeration {

	public static void main(String[] args) {
		String libelle ="Hiver";
		//List<Saison> list = Arrays.asList(Saison.values());
		//System.out.println(list);
		Saison[] saison = Saison.values();
		for(Saison element: saison) {
			System.out.println(element);
			/*if(element.getLibelle().equals(libelle)) {
				System.out.println("test");
			}*/
			
		}
		Saison ete = Saison.valueOf("ETE");
		System.out.println(ete);
		 Saison test = Saison.HIVER.instanceSaison(libelle);
		 
		System.out.println(test);
		

	}

}

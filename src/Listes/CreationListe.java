package Listes;

import java.util.ArrayList;

public class CreationListe {
	public static void main(String[] args) {
		ArrayList<Integer> uneList = new ArrayList<Integer>();
		for(int i = 0; i <= 100; i++) {
			uneList.add(i);
			System.out.println(uneList.get(i));
			
		}
	}

}

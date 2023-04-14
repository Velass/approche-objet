package Listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		liste1.add(-1);
		liste1.add(5);
		liste1.add(7);
		liste1.add(3);
		liste1.add(-2);
		liste1.add(4);
		liste1.add(8);
		liste1.add(5);
		System.out.println(liste1);
		System.out.println(liste1.size());
		System.out.println(Collections.max(liste1));
		System.out.println(Collections.min(liste1));
		liste1.remove(Collections.min(liste1));
		System.out.println(liste1);
		for( int i = 0; i < liste1.size(); i++ ) {
			int val = liste1.get(i);
			if(val < 0) {
				System.out.println(val);
				liste1.set(i , -val );
			}	
			
		}
		System.out.println(liste1);
	}

}

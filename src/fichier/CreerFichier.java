package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		//String test = null;
		ArrayList<String> newListe = new ArrayList<String>();
		Path path = Paths.get("C:/Users/pc/Desktop/diginamic/JAVA/fichier/recensement.csv");
		System.out.println(path);
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		System.out.println(lines);
		for (int i = 0; i <100 ; i++) {
			newListe.add(lines.get(i));
		    }
		/*int nombre100 = 0;
		if(nombre100 < 100) {
			for(String element: lines) {
				newListe.add(element);
			};
		}*/

		//System.out.println(test);
		System.out.println(newListe);
	}

}

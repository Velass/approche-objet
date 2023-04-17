package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
	
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/pc/Desktop/diginamic/JAVA/fichier/recensement.csv");
		System.out.println(path);
		String [] tab1 = null;
		ArrayList<Ville> liste1 = new ArrayList<Ville>();
		System.out.println(liste1);
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		System.out.println(lines);
		for (int i = 0; i <lines.size() ; i++) {
			System.out.println(lines.get(i));
			tab1 = lines.get(i).split(";");
			System.out.println(tab1.toString());
			
		    }
	}

}

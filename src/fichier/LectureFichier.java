package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureFichier {

	public static Path path = Paths.get("C:/Users/furna/Desktop/Diginamic/JAVA/fichier/recensement.csv");
	public static Path path1 = Paths.get("C:/Users/furna/Desktop/Diginamic/JAVA/fichier/monFichier.txt");

	public static void main(String[] args) throws IOException {

		System.out.println(path);
		String[] tab1 = null;
		ArrayList<Ville> liste1 = new ArrayList<Ville>();
		ArrayList<String> liste2 = new ArrayList<String>();
		System.out.println(liste1);
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		System.out.println(lines);
		for (int i = 1; i < lines.size(); i++) {

			// System.out.println(lines.get(i));
			tab1 = lines.get(i).split(";");
			tab1[9] = tab1[9].trim().replaceAll(" ", "");
			// System.out.println(Arrays.toString(tab1));
			Ville ville1 = new Ville(tab1[6], Integer.parseInt(tab1[0]), tab1[1], Integer.parseInt(tab1[9]));
			// System.out.println(ville1);
			
			if (ville1.popTotal > 25000) {
				Ville ville2 = new Ville(tab1[6], Integer.parseInt(tab1[0]), tab1[1], Integer.parseInt(tab1[9]));
				liste2.add(ville2.toString());
				System.out.println(liste2);
				
			}

		}
		Files.write(path1, liste2);
	}
}

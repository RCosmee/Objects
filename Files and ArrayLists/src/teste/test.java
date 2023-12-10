package teste;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try {
		File f = new File("Files/example.txt");
			Scanner s = new Scanner(f);
			
			while(s.hasNextLine()) {
				String line = s.nextLine();
				System.out.println(line);
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.err.println("Ficheiro nao encontrado");
			e.printStackTrace();
		}
		
		
	}
}

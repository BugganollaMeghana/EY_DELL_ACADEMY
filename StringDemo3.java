package EY_Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
		String fullText = "";
		try {
			FileReader myReader = new FileReader(new Files("/"));
			Scanner scan = new Scanner(myReader);
			while(scan.hasNextLine()) {
				fullText = fullText + scan.nextLine();
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Something went wrong.");
			e.printStackTrace();
		}
		System.out.println(fullText);
	}

}

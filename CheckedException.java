package EY_1708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CheckedException {

	public static void main(String[] args) {
	
		BufferedReader br = null;
		Reader r = new InputStreamReader(System.in); //console written one is read
		br = new BufferedReader(r);
		String str;
		
		try {
		
		do {
			System.out.println("Please enter the sth, I will read it for you");
			str = br.readLine();
			System.out.println("What you have entered is " +str);
			
		} while(!str.equalsIgnoreCase("exit"));

	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close(); //closing reader
			} catch (IOException e) {
				e.printStackTrace(); 
			}
		}
	}
	}
}

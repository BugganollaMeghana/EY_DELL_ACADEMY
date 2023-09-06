package EY_Practice;

import java.time.Duration;
import java.time.Instant;

public class TimeDelta {

	public static void main(String[] args) {
		//Output current date-time in UTC
		Instant start = Instant.now(); //save current date-time in UTC
		String outputStart = start.toString();
		
		String strS = "matryoshka";
		String strC = "try";
		boolean isFound = strS.indexOf(strC) !=-1? true:false;
		if(isFound) {
			System.out.println("Substring found");
		} else 
			System.out.println("Substring not found");
		
		System.out.println("Source String length: "+strS.length());
		System.out.println("pattern string length: " +strC.length());
		
		//Output current date-time in UTC
		Instant end = Instant.now();
		String outputEnd = end.toString();
		
		long delta = Duration.between(start, end).toMillis();
		System.out.println("\n");
		System.out.println("Start Time:" + outputStart);
		System.out.println("End Time: " + outputEnd);
		System.out.println("Time elapsed: "+ delta + " milliseconds");
		

	}

}

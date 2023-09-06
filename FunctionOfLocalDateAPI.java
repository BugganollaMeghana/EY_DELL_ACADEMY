package EY_2808;

import java.time.LocalDate;
import java.time.LocalTime;

public class FunctionOfLocalDateAPI {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		System.out.println("Year " + today.getYear() + " is a leap year" + " not " + today.isLeapYear());
		
		System.out.println("Current time is " + today.atTime(LocalTime.now()));
		
		System.out.println("10 days after today will be " + today.plusDays(10));
		System.out.println("3 weeks after today will be " + today.plusWeeks(3));
		System.out.println("20 months after today will be " + today.plusMonths(20));
		
		System.out.println("10 days before today will be " + today.minusDays(10));
		System.out.println("3 weeks before today will be " + today.minusWeeks(3));
		System.out.println("20 months before today will be " + today.minusMonths(20));
	}

}

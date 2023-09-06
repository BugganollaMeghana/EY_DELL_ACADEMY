package EY_2808;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class NumberFormatAPI {

	public static void main(String[] args) {
		
		long number = 50000L;
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("Number format using Default Locals is " + nf.format(number));
		
		NumberFormat italyNF = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Number format using Italy Locals is " + italyNF.format(number));
		
		NumberFormat defaultCurrency = NumberFormat.getCurrencyInstance();
		System.out.println("Number format using Default currency is " + defaultCurrency.format(number));
		
		NumberFormat usingItalianCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println("Number format using Italy currency is " + usingItalianCurrency);
		
		Currency usd = Currency.getInstance("USD");
		NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Number format using US currency is " + usCurrency.format(12345));
		
		Date currentDate = new Date();
		DateFormat germanDF = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
		System.out.println("Date format using germany locals is " + germanDF.format(currentDate));
	}

}

package EY_2808;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleAPIUsage {

	public static void main(String[] args) {
		
		ResourceBundle rs = ResourceBundle.getBundle("EY_2808.TestBundle");
		displayValue(rs);
		
		Locale swedishLocale = new Locale("sv", "SE");
		ResourceBundle rs2 = ResourceBundle.getBundle("EY_2808.TestBundle", swedishLocale);
		displayValue(rs2);
	}
	
	static void displayValue(ResourceBundle bundle) {
		
		
		System.out.println("Hello Message : " + bundle.getString("my.hello"));
		System.out.println("Hello Message : " + bundle.getString("my.bye"));
		System.out.println("Hello Message : " + bundle.getString("my.question"));
	}

}

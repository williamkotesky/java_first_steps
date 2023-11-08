import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//variable types and print
		
		String name = "Alberto";
		String lastName = "Silva";
		double finalGrade = 5.7864;
		//Locale.setDefault(Locale.US);
		System.out.printf("The student %s %s final grade is %.1f and because of that he's approved. %n", name, lastName, finalGrade);
		
		//variable types and print - exercise
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n %nRecord: %d years old, code %d and gender: %c%n %nMeasure with eight decimal places: %.8f%nRounded (three decimal places): %.3f%n", product1, price1, product2, price2, age, code, gender, measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		
		//data processing and casting
		
		//good practice
		double doubleVariable = 4.0;
		float floatVariable = 4f;
		System.out.printf("%f, %f%n", doubleVariable, floatVariable);
		
		//casting: value explicit conversion 
		int m,n;
		m=5;
		n=4;
		double q = (double) m/n; //forces the division not to round values, preventing losing data
		System.out.println(q);
		
		int r;
		double s;
		s=9.4;
		r = (int) s; //says to compiler that doesn't matter losing data (0.4)
		System.out.println(r);
		
		
	}

}

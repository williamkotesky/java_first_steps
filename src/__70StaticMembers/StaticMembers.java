package __70StaticMembers;

import java.util.Locale;
import java.util.Scanner;

public class StaticMembers {

	public static void main(String[] args) {
		//also called class members
		//oposition of instance members
		//they dont need an object to be called, just the name of the class
		//e.g. Math.sqrt and
		//a class that just has static members is statics and its impossible create instances through it
		//inside a method that is static, you can't call a method that is not static
		
//		double result = Mat.power(2, 8);
//		System.out.println(result);
		//in this example, a static method power in the class Mat was called, there isn't no need that that method is not static, all objects from it would will be the same.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double dollarAmount = sc.nextDouble();
		
		sc.close();
		
		double reaisAmount = CurrencyConverter.dollarReaisConverter(dollarPrice, dollarAmount);
		
		System.out.println("Amount to be paid in reais:");
		System.out.println(reaisAmount);
		
	}

}

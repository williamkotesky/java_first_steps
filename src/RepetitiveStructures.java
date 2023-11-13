import java.util.Locale;
import java.util.Scanner;

public class RepetitiveStructures {

	public static void main(String[] args) {
		// while
		//Scanner sc =  new Scanner(System.in);
		
		/*int x, sum;
		sum = 0;
		x = sc.nextInt();
		
		while(x != 0) {
			sum += + x;
			x = sc.nextInt();
		}
		sc.close();
		System.out.println(sum);*/
		// while keeps going while your condition is TRUE. Which means that if there as expression with
		// || logical operator, if only one of the expression is TRUE then while will continue.
		
		//for
		/*
		int n, sum2, number;
		sum2 = 0;
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			number = sc.nextInt();
			sum2 += number;
		}
		sc.close();
		System.out.println(sum2);
		*/
		//its good to declare the "i" on the for because it will only exists in the execution for time
		
		//do while
		//the condition is verify at the end, that means that its executed at least one time
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double celciusTemperature, fahrenheitTemperature;
		char keepQuestion;
		
		do {
			System.out.println("Digite a temperatura em Celcius: ");
			celciusTemperature = sc.nextDouble();
			fahrenheitTemperature = (9.0*celciusTemperature/5.0) + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheitTemperature);
			System.out.println("Deseja repetir (s/n)?");
			keepQuestion = sc.next().charAt(0);
		} while (keepQuestion == 's');
		
		sc.close();
		
		
		
		
		
		
		
	}

}

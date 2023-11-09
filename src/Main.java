import java.util.Locale;
import java.util.Scanner;

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
		
		
		//input
		Scanner sc = new Scanner(System.in);
		//When sc is not necessary anymore, use sc.close()
		
		String input1;
		
		input1 = sc.next();
		
		System.out.println("Você digitou: "+ input1);
		
		
		//integer number: nextInt()
		//double number: nextDouble(), depends on the system language, for dots use Locale.setDefault before the sc attribution
		//println uses the x.y format even with x,y input
		//char: next().charAt(0): take the first string caractere (with the charAt(0))
		
		String input2;
		int input3;
		
		input2 = sc.next();
		input3 = sc.nextInt();  //same line input: consecutive next()
		
		System.out.println(input2 + " " + input3);
		
		
		//input - part2
		//string input until next line : nextLine()
		String input4 = sc.nextLine();
		System.out.println(input4);
		
		//nextLine problem
		int input5;
		String input6, input7;
		sc.nextLine();
		input5 = sc.nextInt();
		input6 = sc.nextLine();
		input7 = sc.nextLine();
		//If there's a input(not nextLine) before the first nextLine() will be necessary an extra nextLine() because the one that follows the nextInt will consume his enter
		System.out.println(input5 + input6 +  input7);
		
		sc.close();
		
		//math functions
		double number1, number2, number3, answer1;
		int number4, number5, answer3;
		long answer2;
		
		
		number1 = 4.0;
		number2 = 2.0;
		number3 = -5.8;
		number4 = 8;
		number5 = 10;
		
		answer1 = Math.pow(number1, number2); //potencia
		System.out.println(answer1);
		answer1 = Math.sqrt(number1);			//raiz quadrada
		System.out.println(answer1);
		answer1 = Math.addExact(number4, number5);	//soma de dois
		System.out.println(answer1);
		answer1 = Math.subtractExact(number4, number5); //diferença entre os dois
		System.out.println(answer1);
		answer1 = Math.floorDiv(number4, number5);		//divive 2 inteiros e arredonda pra baixo
		System.out.println(answer1);
		answer1 = Math.max(number4, number5);	       //maior entre os dois numeros
		System.out.println(answer1);
		answer1 = Math.min(number4, number5);			//menor entre os dois numeros
		System.out.println(answer1);
		answer2 = Math.round(number3);					// arredonda pro inteiro mais perto no tipo long, se for médio vai pra cima
		System.out.println(answer2);
		answer1 = Math.floor(number3);					//arredonda pra baixo para double
		System.out.println(answer1);
		answer1 = Math.ceil(number3);					//arredonda pra cima para double
		System.out.println(answer1);
		answer1 = Math.rint(number3);					//faz o mesmo que o round, mas no médio arredonda pro inteiro par
		System.out.println(answer1);
		answer1 = Math.random();					//pega um numero "aleatorio" de 0 a 1
		System.out.println(answer1);
		
		int max, min;
		max = 10;
		min = 0;
		answer3 = (int) (Math.random()*(max - min + 1)) + min; // pega um numero "aleatorio" em um intervalo determinado
		System.out.println(answer3);
	}

}

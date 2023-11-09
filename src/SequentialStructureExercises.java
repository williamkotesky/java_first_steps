import java.util.Scanner;
import java.util.Locale;

public class SequentialStructureExercises {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		/*
		 1) Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
		 	
		int number1, number2, sum1;
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		sum1 = number1 + number2;
		
		System.out.println("SOMA = " + sum1);
		
		sc.close();
		*/
		
		/*
		 2) Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double radius, area;	
		radius = sc.nextDouble();
		
		area= Math.PI*Math.pow(radius, 2);
		
		System.out.printf("A=%.4f", area);
		
		sc.close();
		*/
		
		/*
		 3) Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		sc.close();
		
		diferenca = a*b - c*d;
		
		System.out.println("DIFERENCA = " +  diferenca);
		*/
		
		/*
		 4) Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
		 
		
		int employeeNumber,  workedHours;
		double hourlyRate, salary;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employeeNumber = sc.nextInt();
		workedHours = sc.nextInt();
		hourlyRate = sc.nextDouble();
		sc.close();
		
		salary = workedHours*hourlyRate;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", employeeNumber, salary);
		*/
		
		/*
		 5) Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 
		
		int part1Code, part1Amount, part2Code, part2Amount;
		double part1Price, part2Price, totalPrice;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		part1Code = sc.nextInt();
		part1Amount = sc.nextInt();
		part1Price = sc.nextDouble();
		
		part2Code = sc.nextInt();
		part2Amount = sc.nextInt();
		part2Price = sc. nextDouble();
		
		sc.close();
		
		totalPrice = part1Amount*part1Price + part2Amount*part2Price;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", totalPrice);
		*/
		
		/*
		 6) Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre: 		 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangleArea, circleArea, trapezeArea, squareArea, rectangleArea;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.close();
		
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		triangleArea = a*c/2;
		//b) a área do círculo de raio C. (pi = 3.14159)
		circleArea = Math.PI*Math.pow(c, 2);
		//c) a área do trapézio que tem A e B por bases e C por altura. 
		trapezeArea = (a +  b)*c/2;
		//d) a área do quadrado que tem lado B. 
		squareArea = Math.pow(b, 2);
		//e) a área do retângulo que tem lados A e B.
		rectangleArea = a*b;
		
		System.out.printf("TRIANGULO = %.3f%n",triangleArea);
		System.out.printf("CIRCULO = %.3f%n", circleArea);
		System.out.printf("TRAPEZIO = %.3f%n", trapezeArea);
		System.out.printf("QUADRADO = %.3f%n", squareArea);
		System.out.printf("RETANGULO = %.3f%n", rectangleArea);
		
		
		
		
	}

}

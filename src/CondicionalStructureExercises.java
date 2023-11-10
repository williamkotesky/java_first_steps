import java.util.Scanner;
import java.util.Locale;

public class CondicionalStructureExercises {

	public static void main(String[] args) {
		/*
		 1) Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Scanner sc = new Scanner(System.in);
		int number;
		
		number = sc.nextInt();
		sc.close();
		if(number < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		*/
		
		/*
		 2) Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		 
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		number = sc.nextInt();
		sc.close();
		
		if(number%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		*/
		
		/*
		 3) Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
		 
		Scanner sc = new Scanner(System.in);
		int a, b, larger, minor;
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		larger = Math.max(a, b);
		minor = Math.min(a, b);
		
		if(larger%minor == 0) {
			System.out.println("Sao multiplos");
		}  else {
			System.out.println("Nao sao multiplos");
		}
		*/
		
		/*
		 4) Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 
		
		Scanner sc = new Scanner(System.in);
		
		int inicialHour, finalHour, gameDuration;
		
		inicialHour = sc.nextInt();
		finalHour = sc.nextInt();
		sc.close();
		
		if(inicialHour>finalHour) {
			gameDuration = (24 - inicialHour) + finalHour;
			System.out.println("O JOGO DUROU " + gameDuration + " HORAS(S)");
		} else if(inicialHour == finalHour) {
			System.out.println("O JOGO DUROU 24 HORAS(S)");
		} else {
			gameDuration = finalHour - inicialHour;
			System.out.println("O JOGO DUROU " + gameDuration + " HORAS(S)");
		}
		*/
		
		/*
		 5) Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int productCode, productAmount;
		
		double totalPrice=0;
		
		productCode = sc.nextInt();
		productAmount = sc.nextInt();
		sc.close();
		
		if(productCode == 1) {
			totalPrice = productAmount*4.00;
		} else if(productCode == 2) {
			totalPrice = productAmount*4.50;
		} else if(productCode == 3) {
			totalPrice = productAmount*5.00;
		} else if(productCode == 4) {
			totalPrice = productAmount*2.00;
		} else if(productCode == 5) {
			totalPrice = productAmount*1.50;
		}
		
		System.out.printf("TOTAL: R$ %.2f", totalPrice);
		*/
		
		/*
		 6) Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double value;
		
		value = sc.nextDouble();
		sc.close();
		
		if(value <= 25 && value >= 0) {
			System.out.println("Intervalo [0, 25]");
		} else if(value <= 50 && value > 25) {
			System.out.println("Intervalo (25, 50]");
		} else if(value <= 75 && value > 50) {
			System.out.println("Intervalo (50, 75]");
		} else if(value <= 100 && value > 75) {
			System.out.println("Intervalo (75, 100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		*/
		
		/*
		 7) Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		sc.close();
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		} else if(x == 0) {
			System.out.println("Eixo X");
		} else if(y == 0) {
			System.out.println("Eixo Y");
		} else if(x > 0 && y > 0) {
			System.out.println("Q1");
		} else if(x < 0 && y > 0) {
			System.out.println("Q2");
		} else if(x < 0 && y < 0) {
			System.out.println("Q3");
		} else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		
		
		
		 
		
		
		
		
	}

}

//import java.util.Locale;
import java.util.Scanner;

public class RepetitiveStructuresExercises {

	public static void main(String[] args) {
		/*
		 while exercises
		 1) Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		 

		Scanner sc = new Scanner(System.in);
		
		int password;
		
		password = sc.nextInt();
		
		while(password != 2002) {
			System.out.printf("Senha invalida%n");
			password = sc.nextInt();
		}
		sc.close();
		System.out.println("Acesso Permitido");
		*/
		
		/*
		 2) Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		 
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if(x < 0 && y > 0) {
				System.out.println("segundo");
			} else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
		*/
		
		/*
		 3) Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
		 
		
		Scanner sc = new Scanner(System.in);
		
		int clientChoice, alcoholAmount, gasolineAmount, dieselAmount;
		alcoholAmount = 0;
		gasolineAmount = 0;
		dieselAmount = 0;
		
		System.out.println("1. Alcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		System.out.println("Informe o tipo de combustível abastecido:");
		
		clientChoice = 0;
		
		while(clientChoice != 4) {
			
			clientChoice = sc.nextInt();
			
			while(clientChoice != 1 && clientChoice != 2 && clientChoice != 3 && clientChoice != 4 ) {
				System.out.println("Informe o tipo de combustível abastecido segundo os codigos da tabela acima:");
				clientChoice = sc.nextInt();
			}
			
			switch(clientChoice) {
			case 1:
				alcoholAmount += 1;
				break;
			case 2:
				gasolineAmount += 1;
				break;
			case 3:
				dieselAmount += 1;
				break;
			}
			System.out.println("contabilizado");
		}		
		sc.close();
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcoholAmount);
		System.out.println("Gasolina: " + gasolineAmount);
		System.out.println("Diesel: " + dieselAmount);
		*/
		
		//for exercises
		
		/*
		 1) Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
		 
		Scanner sc = new Scanner(System.in);
		int x;

		x = sc.nextInt();
		sc.close();
		for(int i = 0; i < x; i++) {
			if((i+1)%2 != 0) System.out.println(i+1);
		}
 		*/
		
		/*
		 2) Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		 
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int valuesAmountIn, valuesAmountOut;
		valuesAmountIn = 0;
		valuesAmountOut = 0;
		
		for(int i = 0; i < n; i++) {
			if(i+1 <= 20 && i+1 >= 10) {
				valuesAmountIn ++;
			} else {
				valuesAmountOut ++;
			}
		}
		System.out.println(valuesAmountIn + " in");
		System.out.println(valuesAmountOut + " out");
		*/

		/*
		 3) Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double number1, number2, number3, weightedAverage;
		
		for(int i = 0; i < n; i++) {
			number1 = sc.nextDouble();
			number2 = sc.nextDouble();
			number3 = sc.nextDouble();
			
			weightedAverage = (2*number1 + 3*number2 + 5*number3)/10;
			System.out.printf("%.1f%n", weightedAverage);
			
		}
		sc.close();
		*/
		
		/*
		 4) Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n = sc.nextInt();
		int a,b;
		double q;
		
		for(int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(b == 0 ) {
				System.out.println("Divisao impossivel");
			} else {
				q = (double) a/b;
				System.out.printf("%.1f%n", q);
			}
		}
		sc.close();
		*/
		
		/*
		 5) Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
		 
		
		Scanner sc = new Scanner(System.in);
		
		int product = 1;
		int n = sc.nextInt();
		sc.close();
		
		if(n == 0) {
			System.out.println(product);
		} else {
			for(int i = 0; i < n; i++) {
				product *= i+1;
			}
			System.out.println(product);
		}
		*/
		
		/*
		 6) Ler um número inteiro N e calcular todos os seus divisores.
		 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < n; i++) {
			if(n%(i+1) == 0) System.out.println(i+1);
		}
		*/
		
		/*
		 7) Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%d %d %d%n", i+1, (int) Math.pow(i+1, 2), (int) Math.pow(i+1, 3));
		}
		
		
		
		
		
		
	}

}

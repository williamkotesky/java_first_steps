import java.util.Scanner;

public class RepetitiveStructuresExercises {

	public static void main(String[] args) {
		/*
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
		 */
		
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
	}

}

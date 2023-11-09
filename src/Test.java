

public class Test {

	public static void main(String[] args) {
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

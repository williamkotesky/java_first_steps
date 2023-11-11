import java.util.Scanner;

public class RepetitiveStructures {

	public static void main(String[] args) {
		// while
		Scanner sc =  new Scanner(System.in);
		
		int x, sum;
		sum = 0;
		x = sc.nextInt();
		
		while(x != 0) {
			sum += + x;
			x = sc.nextInt();
		}
		sc.close();
		System.out.println(sum);
		// while keeps going while your condition is TRUE. Which means that if there as expression with
		// || logical operator, if only one of the expression is TRUE then while will continue.
		
	}

}

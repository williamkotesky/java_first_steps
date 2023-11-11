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
		
	}

}

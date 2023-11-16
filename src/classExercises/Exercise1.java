package classExercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RectangleExercise1 rectangle;
		rectangle = new RectangleExercise1();
		
		System.out.println("Enter rectangle width and height");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		sc.close();
		
		double area = rectangle.area();
		double perimeter = rectangle.perimeter();
		double diagonal = rectangle.diagonal();
		
		System.out.printf("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n", area, perimeter, diagonal);

	}

}

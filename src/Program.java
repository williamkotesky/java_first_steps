import java.util.Locale;
import java.util.Scanner;

import _64TriangleClass.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		sc.close();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger Area: Triangle X");
		} else {
			System.out.println("Larger Area: Triangle Y");
		}
		
		//static variables (areaX, areaY, p, etc) are save in the Stack area, for static variables.
		//dynamic memory allocation: during program execution a instance with "new" word is saved in a area called Heap
		// when Triangle x, what is is stored in x is a memory adress for instance made in Heap
	}

}

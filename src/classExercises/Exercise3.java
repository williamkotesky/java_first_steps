package classExercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		StudentExercise3 student1 = new StudentExercise3();
		student1.name = sc.nextLine();
		student1.grade1 = sc.nextDouble();
		student1.grade2 = sc.nextDouble();
		student1.grade3 = sc.nextDouble();
		sc.close();
		double finalGrade = student1.finalGrade();
		System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
		
		boolean passVerify = student1.passVerify();
		
		if(passVerify) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60.00 - finalGrade);
		}
	}

}

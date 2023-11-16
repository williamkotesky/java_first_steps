package classExercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		EmployeeExercise2 employee = new EmployeeExercise2();
		
		System.out.println("Name:");
		employee.name = sc.nextLine();
		
		System.out.println("Gross salary:");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		employee.tax = sc.nextDouble();
		
		double netSalary = employee.netSalary();
		System.out.printf("Employee: %s, $ %.2f%n", employee.name,  netSalary);
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		sc.close();
		
		
		
	}

}

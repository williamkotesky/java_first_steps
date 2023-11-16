package classExercises;

public class EmployeeExercise2 {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += percentage*this.grossSalary/100;
		System.out.printf("Update data: %s, $ %.2f%n", name, (grossSalary - tax));
	}
	
	
	
}

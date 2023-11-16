package classExercises;

public class StudentExercise3 {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public boolean passVerify() {
		if(grade1 + grade2 + grade3 > 60.00) {
			return true;
		} else return false;
	}
	
	
}


public class CondicionalStructure {

	public static void main(String[] args) {
		//condicional structure - same as javascript, skipped
		
		//switch
		int expression =1;
		
		switch (expression) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
		default:
			System.out.println("another case");
		}
		
		//ternary
		
		int number = 4;
		String answer;
		
		answer = (number > 3) ? "Yes" : "No";
		System.out.println(answer);
		

	}

}

package __70StaticMembers;

public class StaticMembers {

	public static void main(String[] args) {
		//also called class members
		//oposition of instance members
		//they dont need an object to be called, just the name of the class
		//e.g. Math.sqrt and
		//a class that just has static members is statics and its impossible create instances through it
		//inside a class that is static, you can call a method that is not static
		
		double result = Mat.power(2, 8);
		System.out.println(result);
		//in this example, a static method power in the class Mat was called, there isn't no need which that method was not static, all objects from it would will be the same.

	}

}

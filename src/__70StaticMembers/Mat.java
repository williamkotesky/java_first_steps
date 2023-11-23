package __70StaticMembers;

public class Mat {
	public static final double PI = 3.1415;
	
	public static double power(double base, int exponent) {
		int multi = 1;
		for(int i = 0; i < exponent; i++) {
			multi *= base;
		}
		
		return multi;
	}

}

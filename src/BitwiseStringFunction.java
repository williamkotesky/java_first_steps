
public class BitwiseStringFunction {

	public static void main(String[] args) {
		// bitwise
		
		// & - AND bit-bit operator
		// | - OR bit-bit operator
		// ^ - OR-EXCLUSIVE operator
		
		//OR-EXCLUSIVE(XOR) - its False if all conditions are True
		
		/*
		 1 - true
		 0 - false
		 
		 compare each bit between two numbers:
		 
		 89 - 0101 1001
		 60 - 0011 1100
		 
		  & - 0001 1000 - 24
		  | - 0111 1101 - 125
		  ^ - 0110 0101 - 101
		  
		  89 & 60 = 24
		  89 | 60 = 125
		  89 ^ 60 = 101		 
		 
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		*/
		
		//Strings methods
		
		//string1.compareToIgnoreCase(string2) return = int
		//if 0 means that thw two strings are equal, ignoring case differences
		/*
		 * String string1 = "HELLO"; String string2 = "hello";
		 * System.out.println(string1.compareToIgnoreCase(string2));
		 */
		
		//string1.concat(string2) return = String
		//concatenate the argument string at end of another string
		/*
		 * String string1 = "First"; String string2 = "Second";
		 * 
		 * System.out.println(string1.concat(string2));
		 */
		
		//string1.contains("consult") return = boolean
		// return true if contains the argument int the string
		/*
		 * String string1 = "hello"; System.out.println(string1.contains("hell"));
		 */
		
		//string1.copyValueOf(string2) return = string that represent the char array
		// ITS A STATIC METHOD
		/*
		 * char[] string1 = {'H', 'e', 'l', 'l', 'o', 'I'}; String string2 = "";
		 * 
		 * string2 = String.copyValueOf(string1, 0, 5); //it just can take from 0 index,
		 * the length can be controled though System.out.println(string2);
		 */
		
		//string1.getChars(startIndex, endIndex, destinyArray, indexDestinyArray) return = void
		/*
		 * String string1 = "Hello"; char[] stringArray = new char[3];
		 * 
		 * string1.getChars(0, 3, stringArray, 0); System.out.println(stringArray);
		 */
		
		//string1.indexOf("term") return = int | string1.lastIndexOf("term") return = int
		// indexOf = index of the first occurrence of a term
		// lastIndexOf = index of the last occurrence
		/*
		 * String string1 = "Hello, good, very good morning!";
		 * System.out.println(string1.indexOf("good"));
		 * System.out.println(string1.lastIndexOf("good"));
		 */
		//if return is -1 there is not a occurrence of the term
		
		//string1.length() return = int
		//return the size of the strings, how many caracteres it have
		
		String string1 = "William";
		System.out.println(string1.length());
		
		
		
		
		
		
		
		
	}

}

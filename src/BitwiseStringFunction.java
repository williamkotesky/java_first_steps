import java.util.Scanner;

public class BitwiseStringFunction {

	public static void main(String[] args) {
		// bitwise

		// & - AND bit-bit operator
		// | - OR bit-bit operator
		// ^ - OR-EXCLUSIVE operator

		// OR-EXCLUSIVE(XOR) - its False if all conditions are True

		/*
		 * 1 - true 0 - false
		 * 
		 * compare each bit between two numbers:
		 * 
		 * 89 - 0101 1001 60 - 0011 1100
		 * 
		 * & - 0001 1000 - 24 | - 0111 1101 - 125 ^ - 0110 0101 - 101
		 * 
		 * 89 & 60 = 24 89 | 60 = 125 89 ^ 60 = 101
		 * 
		 * int n1 = 89; int n2 = 60;
		 * 
		 * System.out.println(n1 & n2); System.out.println(n1 | n2);
		 * System.out.println(n1 ^ n2);
		 */

		// Strings methods

		// string1.compareToIgnoreCase(string2) return = int
		// if 0 means that thw two strings are equal, ignoring case differences
		/*
		 * String string1 = "HELLO"; String string2 = "hello";
		 * System.out.println(string1.compareToIgnoreCase(string2));
		 */

		// string1.concat(string2) return = String
		// concatenate the argument string at end of another string
		/*
		 * String string1 = "First"; String string2 = "Second";
		 * 
		 * System.out.println(string1.concat(string2));
		 */

		// string1.contains("consult") return = boolean
		// return true if contains the argument int the string
		/*
		 * String string1 = "hello"; System.out.println(string1.contains("hell"));
		 */

		// string1.copyValueOf(string2) return = string that represent the char array
		// ITS A STATIC METHOD
		/*
		 * char[] string1 = {'H', 'e', 'l', 'l', 'o', 'I'}; String string2 = "";
		 * 
		 * string2 = String.copyValueOf(string1, 0, 5); //it just can take from 0 index,
		 * the length can be controled though System.out.println(string2);
		 */

		// string1.getChars(startIndex, endIndex, destinyArray, indexDestinyArray)
		// return = void
		/*
		 * String string1 = "Hello"; char[] stringArray = new char[3];
		 * 
		 * string1.getChars(0, 3, stringArray, 0); System.out.println(stringArray);
		 */

		// string1.indexOf("term") return = int | string1.lastIndexOf("term") return =
		// int
		// indexOf = index of the first occurrence of a term
		// lastIndexOf = index of the last occurrence
		/*
		 * String string1 = "Hello, good, very good morning!";
		 * System.out.println(string1.indexOf("good"));
		 * System.out.println(string1.lastIndexOf("good"));
		 */
		// if return is -1 there is not a occurrence of the term

		// string1.length() return = int
		// return the size of the strings, how many caracteres it have
		/*
		 * String string1 = "William"; System.out.println(string1.length());
		 */

		// string1.replace('l', 'p') return = new string with caracters replaced;
		// works replacing strings too, no just char
		/*
		 * String string1 = "Hello"; System.out.println(string1.replace('l', 'p'));
		 */

		// string1.split(" ") return = string array
		// parameter: what will be used to split the array in the small parts
		/*
		 * // String string1 = "Hello world, good afternoon!"; // String[] splited =
		 * string1.split(" "); // for(String word: splited) { //
		 * System.out.println(word); // }
		 */

		// string1.substring(startIndex) | string1.substring(finalIndex) return = string
		// cuts a piece of string from one
		/*
		 * String string1 = "Hello big world!";
		 * System.out.println(string1.substring(6)); //doesn't take the 6, but 5
		 * System.out.println(string1.substring(6,9));
		 */

		// string1.toLowerCase() | string1.toUpperCase return = string;
		/*
		 * String string1 = "hello"; System.out.println(string1.toUpperCase()); string1
		 * = "WORLD"; System.out.println(string1.toLowerCase());
		 */

		// string1.trim() return = copy of the string
		// removes blanspace at start and end of a string, creatin a copy
		/*
		 * String string1 = "    Hello    "; System.out.println(string1);
		 * System.out.println(string1.trim());
		 */

		// String.valueOf(int1) return = string
		// IT A STATIC METHOD
		// converts a value like a int in string
		/*
		 * int int1 = 25; System.out.println(int1); String string1 =
		 * String.valueOf(int1); System.out.println(string1 instanceof String); //true
		 */

		// functions
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		showResult(higher);
		sc.close();

	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}

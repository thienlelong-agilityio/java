import java.util.Arrays;

public class StringTest {
	public static void main(String args[]) {
		char a = 'a';
		char b = 'b';
		char aUp = 'A';
		String aStr = "a";

		int aInt = (int) a;
		int bInt = (int) b;
		int aUpInt = (int) aUp;
		int aIntStr = (int) aStr.charAt(0); // You cannot directly convert string to int 

		System.out.println("ASCII of a char: " + aInt);
		System.out.println("ASCII of b char: " + bInt);
		System.out.println("ASCII of A char: " + aUpInt);
		System.out.println("ASCII of a String: " + aIntStr);	

		System.out.println();


		String abc = "edcba";
		System.out.println("Original String: " + abc);

		String abcArray[] = abc.split("");
		Arrays.sort(abcArray);  // Arrays are mutable and this only works with the java.util library

		// char abcArray[] = abc.split(""); // This will not work because it is a char
		char abcCharArray[] = abc.toCharArray();

		// abcCharArray = Arrays.sort(abcCharArray);   // This will not work because Arrays are mutable
		Arrays.sort(abcCharArray);   // Arrays are mutable and this only works with the java.util library

		// System.out.println(abcArray);  // This will not work because it is an array of strings it only works with char
		System.out.println("First element of sorted array of string: " + abcArray[0]);
		
		System.out.println(abcCharArray);
		System.out.println("Array of char sorted that will not print correctly if tyou add text: " + abcCharArray);
		System.out.println("You have to add String.valueO(array) for it to show correctly: " + String.valueOf(abcCharArray));  // String.valueOf() returns the string value
	}
}
public class StringTest {
	public static void main(String args[]) {
		String str1 = "Hola como estas?";
		String str2 = new String("Bien y tu?");
		String str3 = "Good, just testing some strings!";
		String str4 = str1;
		String str5 = new String("Hola como estas?");
		String str6 = "Hola como estas?"; // This is the same as str1 because they are refencing the same object in a pool

		System.out.println(str4);

		System.out.println();

		System.out.println("Testing equals(): ");
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equals(str4)); // true
		System.out.println(str1.equals(str5)); // true
		System.out.println(str1.equals(str6)); // true

		System.out.println();

		System.out.println("Testing == sign: ");
		System.out.println(str1==str2); // false
		System.out.println(str1==str4); // true
		System.out.println(str1==str5); // false becase str5 is created from another pool (a new object) instead of referencing the same
		System.out.println(str1==str6); // true

		// Read this for more info about equals and ==: http://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java

		System.out.println();

		System.out.println("str1 length = " + str1.length());
		System.out.println("str2 length = " + str2.length());
		System.out.println("str3 length = " + str3.length());
		System.out.println("str5 length = " + str5.length());


		//compareTo compares two strings lexicographically not by their lengths. Some characters are greater than other
		System.out.println();

		String hi = "hi";
		String chao = "chao";

		System.out.println("hi.compareTo(chao) = " + hi.compareTo(chao));
		System.out.println("chao.compareTo(hi) = " + chao.compareTo(hi));
		System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2));
		System.out.println("str1.compareTo(str3) = " + str1.compareTo(str3));
		System.out.println("str1.compareTo(str5) = " + str1.compareTo(str5));
		System.out.println("str1.compareTo(str6) = " + str1.compareTo(str6));



		// substring(index of start inclusive, index of end exclusive)
		System.out.println();

		String substr = str1.substring(0, 10);
		System.out.println("Substring of str1: " + substr);
	}
}
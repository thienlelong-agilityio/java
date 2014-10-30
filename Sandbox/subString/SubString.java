// Substring testing
// str.substring(Inclusive index, exclusive index)
// str.substring(From this inclusive index until the end)

public class SubString {
	public static void main(String args[]) {

		String str = "01234567";
		int n = str.length();
		System.out.println("Original String: " + str);
		System.out.println("str.substring(0,0): " + str.substring(0,0));   // Nothing
		System.out.println("str.substring(0,1): " + str.substring(0,1));	// 0
		System.out.println("str.substring(0,2): " + str.substring(0,2));  // 01
		System.out.println("str.substring(3): " + str.substring(3));  // 3456
		System.out.println("str.substring(n): " + str.substring(n));  // Nothing
		System.out.println("str.substring(n-1): " + str.substring(n-1));  // 7, last character
		System.out.println("str.substring(0): " + str.substring(0));		// 01234567

	}
}
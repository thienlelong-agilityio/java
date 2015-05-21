// Get all the permutations of a string
// http://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string

public class Permutation {

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();

		if(n == 0) {
			System.out.println(prefix);
		} else {
			for(int i=0; i<n; i++) {
				permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1));
			}
		}
	}


	// Main
	public static void main(String args[]) {
		String str = "abc";
		System.out.println("Original String: " + str);

		System.out.println("Permutations of String: ");

		// System.out.println(permutation(str));
		permutation(str);
	}
}
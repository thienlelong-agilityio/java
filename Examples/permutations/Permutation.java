public class Permutation {
	public static void main(String args[]) {
		String str = "abcd";
		System.out.println("Original String: " + str);

		System.out.println("Permutations of String: ");

		System.out.println(permutation(str));
	}

	public static String permutation(String str) { 
		String str1 = "";
    	permutation(str1, "", str); 
    	return str1;

	}

	private static void permutation(String str1, String prefix, String str) {
	    int n = str.length();
	    if (n == 0) {
	    	str1 += prefix + " ";
	    }

	    else {
	        for (int i = 0; i < n; i++) {
	            permutation(str1, prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	    }
	}	
}
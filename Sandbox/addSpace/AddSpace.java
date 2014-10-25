class AddSpace {
	public static void main(String args[]) {
		String str = "Hola    123   5s ";
		System.out.println(addSpace(str));
		String	hw = "   Hello     World  Hi   ";
		System.out.println(addSpace(hw));
		String eq = "(12+((23+ 37) * (774*435)))";
		System.out.println(addSpace(eq));

		System.out.println();
		System.out.println("Array: ");
		String strA[] = toArray(eq);

		for(int i=0; i<strA.length; i++) {
			System.out.print(strA[i] + " ");
		}

		System.out.println();
	}

	// This method will take each element and put it into an array of String
	static String[] toArray(String str) {
		String strA[];
		strA = str.replaceAll("(\\d+|\\W)", "$0 ").replaceAll("\\s+", " ").trim().split("\\s+");
		return strA; 
	}

	static String addSpace(String str) {
		// Somehow you have to use (\\d+|\\W) instead of [\\d+\\W]
		str = str.replaceAll("(\\d+|\\W)", "$0 ").replaceAll("\\s+", " ").trim();
		return str; 
	}
}
public class CharToUp {
	public static void main(String args[]) {
		char chLow;
		char chUp;	

		for(int i=0; i<26; i++) {
			chLow = (char) ('a' + i);
			chUp = (char) ('a' - 32 + i); // In ASCII lower case is exactly 32 greater than uppercase
			System.out.println(chLow + " " + chUp);
		}
	}
}
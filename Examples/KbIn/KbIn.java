public class KbIn {
	public static void main(String args[])
		throws java.io.IOException {

		char ch;

		System.out.println("Enter any character please: ");

		// For the user to input from keaboard
		ch = (char) System.in.read();

		System.out.println("You just entered: " + ch);
	}
}
public class Guess {
	public static void main(String args[]) 
		throws java.io.IOException {

		char ch, answer = 'k';

		System.out.println("Guess the character between A-Z that I'm thinking: ");
		ch = (char) System.in.read();

		if(ch == answer) {
			System.out.println("You got it right!");
		} else {
			System.out.println("You are wrong! I was thinking of " + answer);
		}
	}
}
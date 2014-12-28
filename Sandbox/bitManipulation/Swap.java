// Swap without creating an extra variable

public class Swap {
	public static void main(String args[]) {
		int x = 1;
		int y = 2;

		x = x^y;
		y = x^y;
		x = x^y;

		System.out.println(x + ", " + y);
	}
}
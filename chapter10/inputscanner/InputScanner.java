// Testing scanner input page 369
// http://examples.javacodegeeks.com/core-java/util/scanner/java-util-scanner-example/

import java.util.Scanner;

public class InputScanner {
	public static void main(String args[]) {

		// System takes System.in which is the InputStream from
		Scanner scanner = new Scanner(System.in);
		String message;
		double num, den;
		System.out.println("Division: ");

		System.out.println("Please input numerator: ");
		num = scanner.nextDouble();

		System.out.println("Please input denominator: ");
		den = scanner.nextDouble();

		System.out.println(num + "/" + den + " = " + num/den);

		scanner.nextLine(); // You have to use this here because the next line is a \n because you pressed enter
		System.out.println("Please type a message: ");
		message = scanner.nextLine(); // You have to use nextLine() if you also want to take spaces between strings 

		System.out.println("You just typed: " + "\"" + message + "\"");

		System.out.println("Please type a message: ");
		message = scanner.nextLine(); // You have to use nextLine() if you also want to take spaces between strings 

		System.out.println("You just typed: " + "\"" + message + "\"");
	}
}
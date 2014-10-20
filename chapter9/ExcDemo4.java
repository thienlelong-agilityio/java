// Exception Handling Page 309

public class ExcDemo4 {
	public static void main(String args[]) {
		int num[] = {2, 4, 6, 8, 10, 12, 14};
		int den[] = {1, 0, 2, 4, 5};

		try {
			for(int i=0; i<num.length; i++) {
				try {
					System.out.println(num[i] + "/" + den[i] + " = " + num[i]/den[i]);
				} catch (ArithmeticException exc) {
					System.out.println("Cannot divide by zero.");
				} catch (ArrayIndexOutOfBoundsException exc) {
					System.out.println("Array out of bounds.");
				} 
				// This will catch any type of exception that happens because this is the superclass of all exceptions
				// You should put it in last, so more specific exceptons are thrown first
				catch (Throwable exc) { 
					System.out.println("Some exception ocurred.");
				}
			} // End of for loop

			// You can manually throw an exception
			throw new ArithmeticException();
		} catch (Exception exc) {
			System.out.println("Catching the manually thrown exception.");
		}
	}
}
/*
Hierarchy of classes
These are more specific exception classes
java.lang.Object -> java.lang.Throwable -> java.lang.Exception -> java.lang.RuntimeException
ArithmeticException, ArrayIndexOutOfBoundsException... are subclasses of RuntimeException
*/
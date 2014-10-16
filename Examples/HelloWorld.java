// Just testing how to use methods

public class HelloWorld {
	public static void main(String args[]) {
		helloworld();
	}

	// This cannot be inside the main method because Java does not support nested methods
	public static void helloworld() {
		System.out.println("Hello World");
	}
}
// Just testing how to use methods

public class HelloWorld {
	public static void main(String args[]) {
		HelloWorld hw = new HelloWorld(); // You have to create a new HelloWorld object if you are not using static methods
		hw.helloWorld();

		helloWorldStatic();
	}

	// This cannot be inside the main method because Java does not support nested methods
	public void helloWorld() {
		System.out.println("Hello World");
	}

// You don't need to create a new object if you are just using a static method
	public static void helloWorldStatic() {
		System.out.println("Hello World Static!");
	}
}



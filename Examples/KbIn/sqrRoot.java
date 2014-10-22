public class sqrRoot {
	public static void main(String args[]) {
		double squareRoot;
		
		for(int i=1; i<100; i++) {
			squareRoot = Math.sqrt(i);
			System.out.println("The square root of " + i + " is " + squareRoot);
		}
	}
}
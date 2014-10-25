public class LambdaDemo {
	public static void main(String args[]) {
		NumericTest lessThan;

		// Lambda Expression
		lessThan = (n, d) -> n<d;

		System.out.println("5 is less than 10: " + lessThan.test(5, 10));
		System.out.println("10 is not less than 5: " + lessThan.test(10, 5));		
	}
}
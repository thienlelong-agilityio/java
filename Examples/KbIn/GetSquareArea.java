public class GetSquareArea {
	public static void main(String args[]) 
		throws java.io.IOException {
			System.out.println("Please input the length/height of the square: ");
			int area;

			// I think for ints and doubles you should not use System.in.read()
			area = (int) System.in.read();

			System.out.println("The area of the square is: " + area);
		}
}
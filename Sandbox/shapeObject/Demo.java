public class Demo {
	public static void main(String args[]) {
		Shape rect = new Rectangle(2, 3);
		System.out.println(rect.getArea());

		Triangle tri = new Triangle(2, 4);
		System.out.println(tri.getArea());
	}
}
public class AddMeth {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(4, 16, 21);
		Vehicle sportcar = new Vehicle(2, 15, 20);

		System.out.println("Minivan passengers is: " + minivan.passengers);
		System.out.println("Minivan fuel cap is: " + minivan.fuelcap);
		System.out.println("Minivan mpg is: " + minivan.mpg);
		System.out.println("Minivan range is: " + minivan.range());

		System.out.println("Sportcar passengers is: " + sportcar.passengers);
		System.out.println("Sportcar fuel cap is: " + sportcar.fuelcap);
		System.out.println("Sportcar mpg is: " + sportcar.mpg);
		System.out.println("Sportcar range is: " + sportcar.range());
	}
}
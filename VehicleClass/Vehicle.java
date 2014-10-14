public class Vehicle {
	int passengers, fuelcap, mpg;

	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	int range() {
		return mpg * fuelcap;
	}
}
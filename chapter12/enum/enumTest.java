enum Fruit {
	APPLE(1), PEAR(2), PEACH(3), BANANA(4);

	int quantity;

	Fruit(int q) {
		quantity = q;
	}

	int getQuantity() {
		return quantity;
	}
}

class enumTest {
	public static void main(String args[]) {
		Fruit fruit;

		for(Fruit f : Fruit.values()) {
			System.out.println("Fruit: " + f + ". Quantity: " + f.getQuantity());
		}
	}
}
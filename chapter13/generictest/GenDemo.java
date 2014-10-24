class GenDemo {
	public static void main(String args[]) {
		// Declare a new Generic object
		GenericsTest<Integer> intOb = new GenericsTest<Integer>(10);

		System.out.println("Return Integer object: " + intOb.getOb());

		intOb.showType();

		GenericsTest<String> strOb = new GenericsTest<String>("Hola");

		System.out.println("Return String object: " + strOb.getOb());

		strOb.showType();
	}
}
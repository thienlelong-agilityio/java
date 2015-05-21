// Generics page 446

class GenDemo {
	public static void main(String args[]) {
		// Declare a new Generic object
		GenericsTest<Integer> intOb = new GenericsTest<Integer>(10);
		GenericsTwo<Integer, String> twoType = new GenericsTwo<Integer, String>(20, "Hello");

		System.out.println("intOb");
		System.out.println("Return Integer object intOb: " + intOb.getOb());

		intOb.showType();

		GenericsTest<String> strOb = new GenericsTest<String>("Hola");

		System.out.println("Return String object: " + strOb.getOb());

		strOb.showType();

		System.out.println();
		System.out.println("twoType<Integer, String");

		System.out.println("Return value of T Integer: " + twoType.getOb1());
		System.out.println("Return value of V String" + twoType.getOb2());

		twoType.showType();
	}
}
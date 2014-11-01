// Testing what objects are passed by reference

class PassByReference {
	public static void main(String args[]) {
		String str = "Not changed";
		dontChangeString(str);
		System.out.println(str);

		Integer inte = 1;
		dontChangeInteger(inte);
		System.out.println(inte);

		int i = 1;
		dontChangeInt(i);
		System.out.println(i);

		int a[] = {9, 8};
		changeArray(a);
		System.out.println(a[0] + ", " + a[1]);

		int ar[] = {9, 8};
		changeArray(a);
		System.out.println(a[0] + ", " + a[1]);
	}

	// You cannot pass String by reference because they are immutable. Only by value
	public static String dontChangeString(String str) {
		str = "Changed";
		return str;
	}

	// You cannot pass Integer by reference because they are immutable. Only by value
	// Same with Double, Long, etc...
	public static void dontChangeInteger(Integer i) {
		i = 123;
	}

	// You cannot pass primitive types by reference. Only by value
	public static void dontChangeInt(int i) {
		i = 123;
	}

	// Arrays are passed by reference
	public static void changeArray(int a[]) {
		a[0] = 0;
		a[1] = 1;
	}

	// This will also pass by reference
	public static int changeArrayWithInt(int a[]) {
		a[0] = 0;
		a[1] = 1;

		return 99;
	}
}
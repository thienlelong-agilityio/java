class SuperExample {
	public static void main(String args[]) {
		// SubClass subc1 = new SubClass(1);
		// SubClass subc2 = new SubClass(2);
		// System.out.println("SubClass 1: " + subc1.getI());
		// System.out.println("SubClass 2: " + subc2.getI());

		SubClass subc3 = new SubClass(3);
		System.out.println("SubClass 3: " + subc3.i);    // This is the i from SubClass which was never declared
		System.out.println("SubClass 3: " + subc3.getI());   // This is the i from SuperClass which was declared

		SubClass subc4 = new SubClass(4);
		System.out.println("SubClass 3: " + subc3.getI());
		System.out.println("SubClass 4: " + subc4.getI());
	}
}

class SuperClass {
	int i;

	// SuperClass(int i) {
	// 	this.i = i;
	// }

	public int getI() {
		return this.i;
	}
}

class SubClass extends SuperClass {
	int i;

	// SubClass(int p) {
	// 	super(p);
	// }

	SubClass(int p) {
		super.i = p;   // This will initilize the i from the SuperClass
		// i = p;    // This will initilize the i from the SubClass
	}
}


class SuperExample {
	public static void main(String args[]) {
		SubClass subc1 = new SubClass(1);
		SubClass subc2 = new SubClass(2);

		System.out.println("SubClass 1: " + subc1.getI());
		System.out.println("SubClass 2: " + subc2.getI());
	}
}

class SuperClass {
	private int i;

	SuperClass(int i) {
		this.i = i;
	}

	public int getI() {
		return this.i;
	}
}

class SubClass extends SuperClass {
	SubClass(int p) {
		super(p);
	}
}


class GenericsTest<T> {
	T ob;

	GenericsTest(T genOb) {
		ob = genOb;
	}

	T getOb() {
		return ob;
	}

	void showType() {
		System.out.println("Type of T is: " + ob.getClass().getName());
	}
}
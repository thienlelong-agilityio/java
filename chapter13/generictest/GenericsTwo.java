// Generics page 446

class GenericsTwo<T, V> {
	T ob1;
	V ob2;

	GenericsTwo(T genOb1, V genOb2) {
		ob1 = genOb1;
		ob2 = genOb2;
	}

	T getOb1() {
		return ob1;
	}

	V getOb2() {
		return ob2;
	}

	void showType() {
		System.out.println("T is type: " + ob1.getClass().getName());
		System.out.println("V is Type: " + ob2.getClass().getName());
	}

}
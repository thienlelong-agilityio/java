// Queue Interface page 285

public class IQDemo {
	public static void main(String args[]) {
		CircularQueue cir = new CircularQueue(4);
		DynQueue dyn = new DynQueue(2);

		System.out.println("Circular Queue: ");
		cir.put('a');
		cir.put('b');
		cir.put('c');
		cir.put('d');
		System.out.println(cir.get());
		cir.put('e');

		System.out.println("Dynamic Queue: ");
		dyn.put('a');
		dyn.put('b');
		dyn.put('c');
		dyn.put('d');
	}
}
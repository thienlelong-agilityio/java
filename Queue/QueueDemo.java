public class QueueDemo {
	public static void main(String args[]) {
		Queue q = new Queue(5);

		q.put('a');
		q.put('b');
		q.put('c');
		q.put('d');
		q.put('e');
		q.put('f'); // Queue is full

		System.out.println();

		System.out.println("Get: " + q.get());
		System.out.println("Get: " + q.get());
		System.out.println("Get: " + q.get());
		System.out.println("Get: " + q.get());
		System.out.println("Get: " + q.get());
		System.out.println("Get: " + q.get());
	}
}
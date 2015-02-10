import java.util.PriorityQueue;

public class PQTest {
	public static void main(String args[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(7);
		pq.add(4);
		pq.add(5);
		pq.add(3);
		pq.add(9);
		pq.add(6);

		System.out.println("Poll (remove min): " + pq.poll());
		System.out.println("Peek: " + pq.peek());
	}
}
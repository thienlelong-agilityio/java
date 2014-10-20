// Queue Interface page 285

public class FixedQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;

	public FixedQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	public void put(char ch) {
		if(putloc == q.length) {
			System.out.println("Queue is full.");
			return;
		} else {
			q[putloc++] = ch;
		}
	}

	public char get() {
		if(putloc == getloc) {
			System.out.println("Queue is empty");
			return (char) 0;
		} else {
			return q[getloc++];
		}
	}
}
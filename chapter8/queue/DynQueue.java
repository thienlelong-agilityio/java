// Queue Interface page 285
// Dynamic Queue

public class DynQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;

	public DynQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	public void put(char ch) {
		if(putloc == q.length) {
			char t[] = new char[q.length * 2]; // Double the size if queue is full

			// Copy all the elements from q to temporal array
			for(int i=0; i<q.length; i++) {
				t[i] = q[i];
			}

			// Make q reference to the new t
			q = t;
		}

		q[putloc++] = ch;
	}

	public char get() {
		if(putloc == getloc) {
			System.out.println("Queue is empty");
			return (char) 0;
		}

		return q[getloc++];
	}
}
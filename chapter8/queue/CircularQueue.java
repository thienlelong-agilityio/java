// Queue Interface page 285

public class CircularQueue implements ICharQ{
	private char q[];
	private int putloc, getloc;

	public CircularQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}

	/* Queue is full if either putloc is one less than
   getloc, or if putloc is at the end of the array
   and getloc is at the beginning. */
	public void put(char ch) {
		if((putloc+1 == getloc) || ((putloc == q.length-1) && (getloc == 0))) {
			System.out.println("Queue is full.");
			return;
		}
		q[putloc++] = ch;
		if(putloc==q.length) {
			putloc = 0;
		}
	}

	public char get() {
		if(putloc == getloc) {
			System.out.println("Queue is empty");
			return (char) 0;
		}
		char ch = q[getloc++];
		if(getloc == q.length) {
			getloc = 0;
		}
		return ch;
	}

}
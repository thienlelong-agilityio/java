public class Queue {
	private char q[];
	private int putloc;
	private int getloc;

	Queue(int size) {
		q = new char[size];
		putloc = 0;
		getloc = 0;
	}

	Queue(Queue ob) {
		q = new char[ob.q.length];
		putloc = ob.putloc;
		getloc = ob.getloc;

		for(int i=getloc; i<putloc; i++) {
			q[i] = ob.q[i];
		}
	}

	Queue(char ch[]) {
		putloc = 0;
		getloc = 0;
		q = new char[ch.length];

		for(int i=0; i<ch.length; i++) {
			this.put(ch[i]);
		}
	}

	char get() {
		if(putloc == getloc) {
			System.out.println("Queue is empty ");
			return (char) 0;
		} else {
			return q[getloc++];
		}
	}

	void put(char ch) {
		if(putloc == q.length) {
			System.out.println("Queue is full");
			return;
		} else {
			q[putloc++] = ch;
		}
	}


}